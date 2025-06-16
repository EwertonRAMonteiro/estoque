package com.rubi.sistemaestoque.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "itemRequests")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemRequestId;

    @Column(name = "quantRequest", nullable = false)
    private Integer quantRequest;

    @JsonIgnore
    @OneToMany(mappedBy = "requests", fetch = FetchType.LAZY)
    public List<Request> requestsId;

    @JsonIgnore
    @OneToMany(mappedBy = "products", fetch = FetchType.LAZY)
    public List<Product> productsId;


}
