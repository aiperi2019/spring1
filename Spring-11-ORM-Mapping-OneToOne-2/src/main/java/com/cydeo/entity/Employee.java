package com.cydeo.entity;

import com.cydeo.enums.Gender;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="employees")
@Data
@NoArgsConstructor
public class Employee extends BaseEntity{
    private String firstName;
    private String lastName;
    private String email;

    @Column(columnDefinition = "DATE")
    private LocalDate hireaDate;
    private int salary;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name="department_id")
    private Department department;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="region_id")
    private Region region;


    public Employee(String firstName, String lastName, String email, LocalDate hireaDate, int salary, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.hireaDate = hireaDate;
        this.salary = salary;
        this.gender = gender;
    }
}
