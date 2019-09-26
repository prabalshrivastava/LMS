package com.perennial.lms.services;

import com.perennial.lms.entity.LeaveMasterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaveRepo extends JpaRepository<LeaveMasterEntity, Integer> {

}
