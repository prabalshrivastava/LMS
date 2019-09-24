package com.perennial.lms.enitity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Team_Master", schema = "leave_management_system", catalog = "")
public class TeamMasterEntity {
    private int teamId;
    private String name;

    @Id
    @Column(name = "team_id")
    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeamMasterEntity that = (TeamMasterEntity) o;
        return teamId == that.teamId &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teamId, name);
    }
}
