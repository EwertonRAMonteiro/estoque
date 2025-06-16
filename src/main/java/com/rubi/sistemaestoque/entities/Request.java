package com.rubi.sistemaestoque.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.rubi.sistemaestoque.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.xml.crypto.Data;
import java.util.List;

@Entity
@Table(name = "requests")
@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRequest;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private Status status;

    @Column(name = "requestData")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Data requestData;

    @Column(name = "approveData")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Data approvData;

    @JsonIgnore
    @OneToMany(mappedBy = "users", fetch = FetchType.LAZY)
    public List<User> userId;

    @JsonIgnore
    @OneToMany(mappedBy = "users", fetch = FetchType.LAZY)
    public List<User> admId;



}
