package com.jobail.school_management_system1.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "students")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Students {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
  @ManyToOne
  @JoinColumn(name = "class_id")
  private Classes classes;
    private String name;
    private Integer rollNumber;
    private LocalDate dateOfBirth;
@Enumerated(EnumType.STRING)
    private Gender gender;
    private String fatherName;
    private String motherName;
    private String guardianPhone;
    private String address;
@Column(insertable = false, updatable = false)
    private Instant createdDate;




}
