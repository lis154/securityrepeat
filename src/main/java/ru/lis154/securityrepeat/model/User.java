package ru.lis154.securityrepeat.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "users")
public class User {
//    @Id
//    @GenetatedValue()
    private Long id;
}
