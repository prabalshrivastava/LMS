package com.perennial.lms.services;

import com.perennial.lms.controller.CompoffController;
import com.perennial.lms.entity.CompoffMasterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface CompoffRepo extends JpaRepository<CompoffMasterEntity,Integer> {

}
