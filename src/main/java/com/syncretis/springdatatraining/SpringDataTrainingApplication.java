package com.syncretis.springdatatraining;

import com.syncretis.springdatatraining.model.Department;
import com.syncretis.springdatatraining.model.Document;
import com.syncretis.springdatatraining.model.Language;
import com.syncretis.springdatatraining.model.Person;
import com.syncretis.springdatatraining.service.DepartmentService;
import com.syncretis.springdatatraining.service.DocumentService;
import com.syncretis.springdatatraining.service.LanguageService;
import com.syncretis.springdatatraining.service.PersonService;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringDataTrainingApplication {

    public static void main(String[] args) {
        //initialize zone
        SpringApplication application = new SpringApplication(SpringDataTrainingApplication.class);
//        application.setBannerMode(Banner.Mode.OFF);
        ConfigurableApplicationContext run = application.run(args);
        DepartmentService departmentService = run.getBean("departmentService", DepartmentService.class);
        PersonService personService = run.getBean("personService", PersonService.class);
        LanguageService languageService = run.getBean("languageService", LanguageService.class);
        DocumentService documentService = run.getBean("documentService", DocumentService.class);
        //end of initialize zone

        Language rus = new Language("Rus");
        Language eng = new Language("Eng");
        Language ukr = new Language("Ukr");

        languageService.save(rus);
        languageService.save(eng);
        languageService.save(ukr);

        List<Language> lang = languageService.findAll();
//
        Department department = new Department( null);
        departmentService.save(department);
//        Department dep = departmentService.get(1L);
//
//
//        LocalDate date = LocalDate.of(1997, 12, 3);
////
//        Document passport = new Document("Passport", LocalDate.of(2024, 12, 6));
//
//        Person person = new Person("Georgy", "Raznikov", date, dep, lang, passport);
//        personService.save(person);
//        Person per = personService.get(1L);
//        System.out.println("*********");
//        System.out.println(per);
//        System.out.println("*********");
//        System.out.println(documentService.findAll());
//        System.out.println("*********");
//
//        Document inn = new Document("INN", LocalDate.of(2050, 6, 1));
//
//        Person updatedPerson = new Person(1,"Georgy", "Raznikov", date, dep, lang, inn);
//        personService.save(updatedPerson);
//        Person per2 = personService.get(1L);
//        System.out.println(per2);
//        System.out.println("*********");
//        System.out.println(documentService.findAll());
//        System.out.println("*********");
//
//        personService.delete(1L);
//        System.out.println("*********");
//        System.out.println("Docserv");
//        System.out.println(documentService.findAll());
//        System.out.println("Perserv");
//        System.out.println(personService.findAll());
//        System.out.println("*********");



        /*//prepare test data 1
        LocalDate date = LocalDate.of(1997, 12, 3);
        Department department = new Department(6L, "Department of cybersecurity of Ukraine");
        Department department2 = new Department(26L, "Department of Testing");
        Person person = new Person("Georgy", "Raznikov", date, department);

        System.out.println("PERSON_DAO TEST");
        System.out.println("INIT TABLE");
        //show init table
        List<Person> persons = personService.findAll();
        for (Person p : persons) {
            System.out.println(p);
        }

        System.out.println("{-----------------------------------------------}");
        System.out.println("INSERTING A NEW PERSON");

        //insert person into table
        Person savedPerson = personService.save(person);
        //see result
        persons = personService.findAll();
        for (Person p : persons) {
            System.out.println(p);
        }

        System.out.println("{-----------------------------------------------}");
        System.out.println("UPDATING A NEW PERSON");

        //prepare test data 2
        savedPerson.setName("Grigoriy");
        savedPerson.setSurname("Rasputin");
        savedPerson.setBirthday(LocalDate.of(1968, 1, 21));
        savedPerson.setDepartment(department2);

        //update Person
        personService.save(savedPerson);
        //see result
        persons = personService.findAll();
        for (Person p : persons) {
            System.out.println(p);
        }
        System.out.println("{-----------------------------------------------}");

        System.out.println("GETTING A PERSON BY ID");
        //find person by ID
        System.out.println(personService.get(savedPerson.getId()));

        System.out.println("{-----------------------------------------------}");

        //prepare test data 3
        savedPerson.setName("Mikhail");
        savedPerson.setSurname("Krug");
        savedPerson.setBirthday(LocalDate.of(1956, 6, 7));
        savedPerson.setDepartment(department);

        Person person2 = new Person("Georgy", "Raznikov", date, department);

        List<Person> personList = new ArrayList<>();
        personList.add(person2);
        personList.add(savedPerson);

        System.out.println("SAVING AND UPDATING ALL PERSONS FROM LIST AT THE SAME TIME");

        //save all and update all at the same time
        List<Person> listForDelete = personService.saveAll(personList);
        //see result
        persons = personService.findAll();
        for (Person p : persons) {
            System.out.println(p);
        }
        System.out.println("{-----------------------------------------------}");
        System.out.println("DELETING ALL PERSONS FROM LIST");

        //delete all
        personService.deleteAll(listForDelete);
        //see result
        persons = personService.findAll();
        for (Person p : persons) {
            System.out.println(p);
        }

        System.out.println("{-----------------------------------------------}");
        System.out.println("DEPARTMENT_DAO TEST");
        System.out.println("INIT TABLE");

        List<Department> departments = departmentService.findAll();
        for (Department d : departments) {
            System.out.println(d);
        }

        System.out.println("{-----------------------------------------------}");
        System.out.println("SAVING A NEW DEPARTMENT");

        //prepare test data
        Department testDep = new Department("Department of Spring Data");

        //save new department
        Department savedDep = departmentService.save(testDep);
        //see result
        departments = departmentService.findAll();
        for (Department d : departments) {
            System.out.println(d);
        }

        System.out.println("{-----------------------------------------------}");
        System.out.println("GETTING DEPARTMENT BY ID");

        //save new department and see result
        System.out.println(departmentService.get(savedDep.getId()));

        System.out.println("{-----------------------------------------------}");
        System.out.println("DELETING DEPARTMENT");

        //deleting department
        departmentService.delete(savedDep.getId());
        //see result
        departments = departmentService.findAll();
        for (Department d : departments) {
            System.out.println(d);
        }*/
    }
}