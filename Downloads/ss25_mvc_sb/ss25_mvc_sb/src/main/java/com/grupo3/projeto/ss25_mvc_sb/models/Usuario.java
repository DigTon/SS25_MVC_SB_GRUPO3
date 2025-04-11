package com.grupo3.projeto.ss25_mvc_sb.models;

public class Usuario {
    private Long id;
    private String user;
    private String password;

    // Construtores
    public Usuario() {}

    public Usuario(Long id, String user, String password) {
        this.id = id;
        this.user = user;
        this.password = password;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}