package com.syncretis.springdatatraining.service;

import com.syncretis.springdatatraining.model.Person;
import com.syncretis.springdatatraining.repo.PersonDao;
import com.syncretis.springdatatraining.util.Validator;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private PersonDao personDao;
    private Validator validator = new Validator();

    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public void delete(Long id) {
        if (id != null) {
            personDao.deleteById(id);
        }
    }

    public void deleteAll(List<Person> list) {
        if (validator.ValidateListOfPersons(list)) {
            personDao.deleteAllInBatch(list);
        }
    }

    public List<Person> findAll() {
        return personDao.findAllByOrderByIdAsc();
    }

    public Person get(Long id) {
        return personDao.findById(id).orElse(null);
    }

    public Person save(Person p) {
        if (validator.ValidatePerson(p)) {
            return personDao.save(p);
        }
        return null;
    }

    public List<Person> saveAll(List<Person> list) {
        if (validator.ValidateListOfPersons(list)) {
            return personDao.saveAll(list);
        }
        return null;
    }
}