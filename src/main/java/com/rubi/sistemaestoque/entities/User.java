package com.rubi.sistemaestoque.entities;

import com.rubi.sistemaestoque.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fisrtName", nullable = false, length = 30)
    private String name;

    @Column( name = "midName", length = 30)
    private String midName;

    @Column(name = "lastName",nullable = false, length = 30)
    private String lastName;

    @Column(name = "userName", nullable = false, length = 30, unique = true)
    private String userName;

    @Column(name = "password")
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    private Role role;

}
