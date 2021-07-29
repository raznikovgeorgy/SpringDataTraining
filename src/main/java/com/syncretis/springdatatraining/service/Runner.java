package com.syncretis.springdatatraining.service;


import com.syncretis.springdatatraining.model.Language;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@AllArgsConstructor
@Transactional
@Service
public class Runner {

    private DepartmentService departmentService;
    private PersonService personService;
    private LanguageService languageService;
    private DocumentService documentService;

    public void run() {
        List<Language> list = languageService.findAll();
        System.out.println(list);
    }
}
