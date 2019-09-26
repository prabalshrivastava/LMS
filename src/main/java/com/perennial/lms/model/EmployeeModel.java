package com.perennial.lms.model;

import lombok.Data;

import java.util.Date;
@Data
public class EmployeeModel {
    private String empId;
    private String name;
    private String password;
    //identify teamid
    private String teamName;
    private String designation;
    private String mobile;
    private String email;
    private Date dob;
    private String gender;
}
