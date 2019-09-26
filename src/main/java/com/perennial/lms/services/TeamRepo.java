package com.perennial.lms.services;

import com.perennial.lms.entity.TeamMasterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepo extends JpaRepository<TeamMasterEntity,Integer> {
}
