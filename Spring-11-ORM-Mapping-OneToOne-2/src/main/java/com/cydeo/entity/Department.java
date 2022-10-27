package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="departments")
@Data
@NoArgsConstructor
public class Department extends BaseEntity{

    private String division;
    private String department;

    @OneToOne(mappedBy = "department")
    private Employee employee;

    public Department(String division, String department) {
        this.division = division;
        this.department = department;
    }
}
