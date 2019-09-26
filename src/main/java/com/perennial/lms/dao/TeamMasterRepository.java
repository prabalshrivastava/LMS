package com.perennial.lms.dao;

import com.perennial.lms.entity.TeamMasterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface TeamMasterRepository extends JpaRepository<TeamMasterEntity, Serializable> {

    public TeamMasterEntity findByName(String name);
}
