package com.perennial.lms.services;

import com.perennial.lms.entity.EmployeeMasterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeMasterEntity,String> {
}
