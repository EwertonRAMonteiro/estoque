package com.rubi.sistemaestoque.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduct;

    @Column(name = "name", nullable = false, length = 60)
    private String name;

    @Column(name = "category", nullable = false, length = 30)
    private String category;

    @Column(name = "qntNow", nullable = false)
    private Integer qntNow;
}
