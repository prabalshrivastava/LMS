package com.perennial.lms.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "Employee_Master")
public class EmployeeMasterEntity {
    @Id

    @Column(name = "emp_id",unique = true)
    private String empId;

    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String password;

    // @OneToOne
    //@Column(name = "team_id")
    //private Integer teamId;

    @Column(name = "designation")
    private String designation;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "email")
    private String email;

    @Temporal(TemporalType.DATE)
    @Column(name = "dob")
    private Date dob;

    @Column(name = "gender")
    private String gender;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy = "empMaster")
    private LeaveMasterEntity leaveMaster;

    @OneToOne
    @JoinColumn(name = "team_id",nullable = false)
    private TeamMasterEntity teamMaster;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy = "empCompoffMaster")
    private CompoffMasterEntity compoffMaster;

}