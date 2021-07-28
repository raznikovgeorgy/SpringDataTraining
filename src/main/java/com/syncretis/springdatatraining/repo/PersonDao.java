package com.syncretis.springdatatraining.repo;

import com.syncretis.springdatatraining.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonDao extends JpaRepository<Person, Long> {
    List<Person> findAllByOrderByIdAsc();
}
