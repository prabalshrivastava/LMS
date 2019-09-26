package com.perennial.lms.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Team_Master")
public class TeamMasterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "team_id")
    private int teamId;

    @Column(name = "name")
    private String name;

    //@OneToOne
//empId from Employee_Master
    @Column(name = "lead")
    private String lead_id;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy = "teamMaster")
    private EmployeeMasterEntity empTeamMaster;
}