package org.dhbw.service.student.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    int id;
    String firstName;
    String lastName;
    String studentNumber;
}