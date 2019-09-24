package com.perennial.lms.enitity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "Leave_Master", schema = "leave_management_system", catalog = "")
public class LeaveMasterEntity {
    private int leaveId;
    private String leaveType;
    private Date fromDate;
    private Date toDate;
    private int fromSession;
    private int toSession;
    private String reason;
    private String status;
    private String remarks;

    @Id
    @Column(name = "leave_id")
    public int getLeaveId() {
        return leaveId;
    }

    public void setLeaveId(int leaveId) {
        this.leaveId = leaveId;
    }

    @Basic
    @Column(name = "leave_type")
    public String getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType;
    }

    @Basic
    @Column(name = "from_date")
    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    @Basic
    @Column(name = "to_date")
    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    @Basic
    @Column(name = "from_session")
    public int getFromSession() {
        return fromSession;
    }

    public void setFromSession(int fromSession) {
        this.fromSession = fromSession;
    }

    @Basic
    @Column(name = "to_session")
    public int getToSession() {
        return toSession;
    }

    public void setToSession(int toSession) {
        this.toSession = toSession;
    }

    @Basic
    @Column(name = "reason")
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "remarks")
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LeaveMasterEntity that = (LeaveMasterEntity) o;
        return leaveId == that.leaveId &&
                fromSession == that.fromSession &&
                toSession == that.toSession &&
                Objects.equals(leaveType, that.leaveType) &&
                Objects.equals(fromDate, that.fromDate) &&
                Objects.equals(toDate, that.toDate) &&
                Objects.equals(reason, that.reason) &&
                Objects.equals(status, that.status) &&
                Objects.equals(remarks, that.remarks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(leaveId, leaveType, fromDate, toDate, fromSession, toSession, reason, status, remarks);
    }
}
