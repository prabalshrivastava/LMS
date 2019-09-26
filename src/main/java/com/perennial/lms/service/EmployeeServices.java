package com.perennial.lms.service;

import com.perennial.lms.entity.EmployeeMasterEntity;
import com.perennial.lms.model.EmployeeModel;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface EmployeeServices {

    //registering employees imported by xls file
     boolean registerEmployeeXls();

     boolean registerEmployee(EmployeeModel employeeModel);

    //upload Xls file
     boolean storeFile(MultipartFile file) throws IOException;
}
