package com.grupo3.projeto.ss25_mvc_sb.models;

public class Cachorro {
    private String nome;
    private String raca;

    public Cachorro(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public void latir() {
        System.out.println(this.nome + " esta latindo");
    }

    public String getNome() {
        return this.nome;
    }
}