package com.mariusz.jobapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

//@Component
@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Entity
@Table(name="users")
public class User {
    @Id
    private int id;
    private String username;
    private String password;
}
