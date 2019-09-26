package com.perennial.lms.dao;

import com.perennial.lms.entity.EmployeeMasterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface EmployeeMasterRepository extends JpaRepository<EmployeeMasterEntity, Serializable> {
}
