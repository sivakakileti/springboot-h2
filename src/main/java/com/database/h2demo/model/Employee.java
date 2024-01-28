package com.database.h2demo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;
import org.hibernate.id.factory.internal.AutoGenerationTypeStrategy;

@Entity
@Table(name = "employee")
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "emp_id")
    Long employeeId;

    @Column(name = "emp_name")
    String employeeName;

    @Column(name = "emp_sal")
    Long employeeSalary;

    @Column(name = "emp_city")
    String city;


}
