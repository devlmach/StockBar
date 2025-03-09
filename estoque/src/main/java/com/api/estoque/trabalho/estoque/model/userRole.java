package com.api.estoque.trabalho.estoque.model;

import lombok.Getter;

@Getter
public enum userRole {

    ADMIN("admin"),
    CLIENT("client");

    private final String role;

    userRole( String role ) {
        this.role = role;
    }

}
