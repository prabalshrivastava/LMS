package com.perennial.lms.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "Compoff_Master")
public class CompoffMasterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "compoff_id")
    private int compoffId;

    //@Column(name = "employee_id")
    //private String empId;

    @Column(name = "leave_type")
    private String leaveType;

    @Temporal(TemporalType.DATE)
    @Column(name = "from_date")
    private Date fromDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "to_date")
    private Date toDate;

    @Column(name = "from_session")
    private int fromSession;

    @Column(name = "to_session")
    private int toSession;

    //empId of reporting person
// @OneToOne
    @Column(name = "called_by")
    private String reportingPerson;

    @Column(name = "reason")
    private String reason;

    @Column(name = "work_type")
    private String workType;

    @Column(name = "no_of_tasks")
    private int noOfTasks;

    @Column(name = "status")
    private String status;

    @Column(name = "remarks")
    private String remarks;

    @OneToOne
    @JoinColumn(name = "emp_id",nullable = false)
    private EmployeeMasterEntity empCompoffMaster;
}