package com.syncretis.springdatatraining.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@Table(
        name = "department",
        uniqueConstraints = @UniqueConstraint(
                name = "uk_department_name",
                columnNames = {"name"}
        )
)
@NoArgsConstructor
@ToString
public class Department {

    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column(name = "name")
    @NotNull(message = "Department Name cannot be null")
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public Department(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
