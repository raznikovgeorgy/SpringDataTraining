package com.syncretis.springdatatraining.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;


@Entity
@Getter
@NoArgsConstructor
@Setter
@Table(
        name = "document",
        uniqueConstraints = @UniqueConstraint(
                name = "uk_document_id",
                columnNames = {"id"}
        )
)
@ToString
public class Document {

    @Column(name = "id")
    @Id
    private String id;

    @Column(name = "expireDate", nullable = false)
    @NotNull(message = "Expire date cannot be null")
    private LocalDate expireDate;

    public Document(String id, LocalDate expireDate) {
        this.id = id;
        this.expireDate = expireDate;
    }
}