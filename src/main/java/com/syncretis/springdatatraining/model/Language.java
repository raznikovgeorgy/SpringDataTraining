package com.syncretis.springdatatraining.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@Entity
@Getter
@NoArgsConstructor
@Setter
@Table(
        name = "language",
        uniqueConstraints = @UniqueConstraint(
                name = "uk_language_name",
                columnNames = {"name"}
        )
)
@ToString
public class Language {

    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column(name = "name")
    @NotNull
    private String name;

    public Language(String name) {
        this.name = name;
    }
}
