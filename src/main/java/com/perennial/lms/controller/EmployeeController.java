package com.perennial.lms.controller;

import com.perennial.lms.entity.EmployeeMasterEntity;
import com.perennial.lms.model.EmployeeModel;
import com.perennial.lms.service.EmployeeServicesImpl;
import com.perennial.lms.services.EmployeeRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/emp")
@RestController
public class EmployeeController {
    @Autowired
    EmployeeServicesImpl employeeServices;

    @RequestMapping(value = "/fetchEmployees", method = RequestMethod.POST)
    public List<EmployeeModel> fetchEmployees() {
        return employeeServices.fetchEmployees();
    }
}