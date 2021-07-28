package com.syncretis.springdatatraining.repo;

import com.syncretis.springdatatraining.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DocumentDao extends JpaRepository<Document, String> {
    List<Document> findAllByOrderByIdAsc();
}