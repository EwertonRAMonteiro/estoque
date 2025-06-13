package com.rubi.sistemaestoque.enums;

public enum Role {
    ADMIN("admin"),
    USER("user");

    private String role;
    Role(String role) {
        this.role = role;
    }

}
