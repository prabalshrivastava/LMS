package com.perennial.lms.resources;

import com.perennial.lms.model.EmployeeModel;
import com.perennial.lms.service.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class EmployeeResource {

    @Autowired
    private EmployeeServices employeeServices;

    @RequestMapping(value = "/uploadFile", method = RequestMethod.GET)
    public String upload() {
        return "uploadFile";
    }

    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
    public String uploadFile(@RequestParam("file") MultipartFile file) {

        try {
            //store excel file
            if (employeeServices.storeFile(file))
                registerByXls();
            return "Success";
        } catch (IOException e) {
            e.printStackTrace();
            return "Failed";
        }

    }

    public String registerByXls() {
        employeeServices.registerEmployeeXls();
        return "Success";
    }

    /**
     * Registration by UI
    * @param employeeModel
     * @return
     */
    @PostMapping(value = "/register", consumes = {"application/json"})
    public String registerEmployee(@RequestBody EmployeeModel employeeModel) {
        if (employeeServices.registerEmployee(employeeModel))
            return "Success";
        else
            return "Failed";
    }

}