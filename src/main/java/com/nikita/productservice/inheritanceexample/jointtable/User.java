package com.nikita.productservice.inheritanceexample.jointtable;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "jt_user")
@Inheritance(strategy = InheritanceType.JOINED)


public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String email;
    private String password;
}
