package com.syncretis.springdatatraining.service;

import com.syncretis.springdatatraining.model.Document;
import com.syncretis.springdatatraining.repo.DocumentDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentService {

    private DocumentDao documentDao;

    public DocumentService(DocumentDao documentDao) {
        this.documentDao = documentDao;
    }

    public void delete(String id) {
        if (id != null) {
            documentDao.deleteById(id);
        }
    }

    public List<Document> findAll() {
        return documentDao.findAllByOrderByIdAsc();
    }

    public Document get(String id) {
        return documentDao.findById(id).orElse(null);
    }

    public Document save(Document d) {
        return documentDao.save(d);
    }
}