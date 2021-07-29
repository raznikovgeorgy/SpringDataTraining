package com.syncretis.springdatatraining.repo;

import com.syncretis.springdatatraining.model.Language;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LanguageDao extends JpaRepository<Language, Long> {
    List<Language> findAllByOrderByIdAsc();
}