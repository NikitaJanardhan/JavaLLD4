package com.nikita.productservice.inheritanceexample.mappedsuperclass;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "mp_ta")


public class TA extends User {
    private double averageRating;
}
