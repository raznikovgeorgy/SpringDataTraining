package com.syncretis.springdatatraining.service;

import com.syncretis.springdatatraining.model.Department;
import com.syncretis.springdatatraining.repo.DepartmentDao;
import com.syncretis.springdatatraining.util.Validator;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    private DepartmentDao departmentDao;
    private Validator validator = new Validator();

    public DepartmentService(DepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
    }

    public void delete(Long id) {
        if (id != null) {
            departmentDao.deleteById(id);
        }
    }

    public List<Department> findAll() {
        return departmentDao.findAllByOrderByIdAsc();
    }

    public Department get(Long id) {
        return departmentDao.findById(id).orElse(null);
    }

    public Department save(Department d) {
//        if (validator.ValidateDepartment(d)) {
            return departmentDao.save(d);
//        }
//        return null;
    }
}
