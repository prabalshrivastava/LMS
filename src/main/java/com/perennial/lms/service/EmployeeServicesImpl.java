package com.perennial.lms.service;

import com.perennial.lms.dao.EmployeeMasterRepository;
import com.perennial.lms.dao.TeamMasterRepository;
import com.perennial.lms.entity.EmployeeMasterEntity;
import com.perennial.lms.model.EmployeeModel;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

@Slf4j
@Service("employeeServices")
public class EmployeeServicesImpl implements EmployeeServices {

    @Autowired
    private EmployeeMasterRepository employeeMasterRepository;

    @Autowired
    private TeamMasterRepository teamMasterRepository;

    @Autowired
    private ServletContext servletContext;

    /**
     * register employees imported by xls file
     *
     * @param
     * @return
     */
    @Override
    public boolean registerEmployeeXls() {

        List<EmployeeMasterEntity> employees = getByXls();
        List<EmployeeMasterEntity> employeeMasterEntities = employeeMasterRepository.saveAll(employees);


        return false;
    }

    /**
     * get Employees list from xls file using POI api
     *
     * @return
     */
    public List<EmployeeMasterEntity> getByXls() {
        List<EmployeeMasterEntity> employees = new ArrayList<>();
        try {
            Workbook workbook = null;
            String filePath = servletContext.getRealPath("/resources/excel/EmployeeDataTemplate.xlsx");
            if (filePath.endsWith(".xlsx")) {
                workbook = new XSSFWorkbook(new FileInputStream(new File(filePath)));
            } else if (filePath.endsWith(".xls")) {
                workbook = new HSSFWorkbook(new FileInputStream(new File(filePath)));
            }
            Sheet sheet = workbook.getSheetAt(0);

            Iterator<Row> rowIterator = sheet.iterator();
            rowIterator.next();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                EmployeeMasterEntity employee = new EmployeeMasterEntity();
                employee.setEmpId(row.getCell(0).toString());
                employee.setName(row.getCell(1).toString());
                //employee.setTeamId(teamMasterRepository.findByName(row.getCell(2).toString()).getTeamId());
                employee.setDesignation(row.getCell(3).toString());
                employee.setGender(row.getCell(4).toString());
                employee.setMobile(row.getCell(5).toString());
                employee.setEmail(row.getCell(6).toString());
                employee.setDob(new SimpleDateFormat("dd-MMM-yyyy").parse(String.valueOf(row.getCell(7))));
                employees.add(employee);
            }
            System.out.println(employees);

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return employees;

    }

    /**
     * Save Excel file
     *
     * @param file
     * @return
     */

    public boolean storeFile(MultipartFile file) {
        if (!file.getOriginalFilename().isEmpty()) {
            try {
                byte[] bytes = file.getBytes();
                Path path = Paths.get(servletContext.getRealPath("/resources/excel/" + file.getOriginalFilename()));
                Files.write(path, bytes);
                return true;
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            return false;
        }
        return true;
    }

    @Override
    public boolean registerEmployee(EmployeeModel employeeModel) {
        try {
            int teamId = teamMasterRepository.findByName(employeeModel.getTeamName()).getTeamId();
            EmployeeMasterEntity employeeMasterEntity = new EmployeeMasterEntity();
            //employeeMasterEntity.setTeamId(teamId);
            BeanUtils.copyProperties(employeeModel, employeeMasterEntity);
            employeeMasterRepository.save(employeeMasterEntity);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    public List<EmployeeModel> fetchEmployees(){
        List<EmployeeMasterEntity> employeeMasterEntityList= employeeMasterRepository.findAll();
        log.debug("employeeMasterEntityList : ",employeeMasterEntityList);
        //employeeMasterEntityList.stream().forEach(emp-> BeanUtils.copyProperties(emp,));
        List<EmployeeModel> employeeModelList = new ArrayList<>();
        for (EmployeeMasterEntity emp:employeeMasterEntityList){
            EmployeeModel employeeModel = new EmployeeModel();
            BeanUtils.copyProperties(employeeModel,emp);
            employeeModelList.add(employeeModel);
        }
        log.debug("employeeModelList : ",employeeModelList);
        return employeeModelList;
    }
}
