package com.perennial.lms.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "Leave_Master")
public class LeaveMasterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="leave_id")
    private Integer leaveId;

    //@ManytoOne
    //@Column(name="employee_id")
    //private String empId;

    @Column(name="leave_type")
    private String leaveType;

    @Temporal(TemporalType.DATE)
    @Column(name="from_date")
    private Date fromDate;

    @Temporal(TemporalType.DATE)
    @Column(name="to_date")
    private Date toDate;

    @Column(name="from_session")
    private int fromSession;

    @Column(name="to_session")
    private int toSession;

    @Column(name="reason")
    private String reason;

//List<empId> in absence responsible employee
//@Column(name="concerned_person")
// @OneToMany
// private List<String> concerned_persons;

    @Column(name="reporting_to")
    private String reportTo;

    @Column(name="status")
    private String status;

    @Column(name="remarks")
    private String remarks;

    @OneToOne
    @JoinColumn(name = "emp_id",nullable = false)
    private EmployeeMasterEntity empMaster;
}