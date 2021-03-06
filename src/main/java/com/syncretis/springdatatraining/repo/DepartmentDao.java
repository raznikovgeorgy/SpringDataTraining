package com.syncretis.springdatatraining.repo;

import com.syncretis.springdatatraining.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentDao extends JpaRepository<Department, Long> {
    List<Department> findAllByOrderByIdAsc();
}