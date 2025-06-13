package com.rubi.sistemaestoque.enums;

public enum Status {
    PENDING("pending"),
    APPROVED("approved"),
    REJECTED("rejected");

    private String status;
    Status(String status) {
        this.status = status;
    }
}
