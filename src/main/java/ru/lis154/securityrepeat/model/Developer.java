package ru.lis154.securityrepeat.model;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Developer {

    private Long id;
    private String firstName;
    private String lastName;


}
