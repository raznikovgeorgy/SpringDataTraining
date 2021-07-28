package com.syncretis.springdatatraining.service;

import com.syncretis.springdatatraining.model.Language;
import com.syncretis.springdatatraining.repo.LanguageDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class LanguageService {
    private LanguageDao languageDao;

    public void delete(Long id) {
        if (id != null) {
            languageDao.deleteById(id);
        }
    }

    public List<Language> findAll() {
        return languageDao.findAllByOrderByIdAsc();
    }

    public Language get(Long id) {
        return languageDao.findById(id).orElse(null);
    }

    public Language save(Language l) {
        return languageDao.save(l);
    }
}