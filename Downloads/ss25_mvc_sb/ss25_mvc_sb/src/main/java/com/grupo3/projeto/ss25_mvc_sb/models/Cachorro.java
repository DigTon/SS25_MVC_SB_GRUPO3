package com.grupo3.projeto.ss25_mvc_sb.models;

public class Cachorro {
    private String nome;
    private String raca;

    // Construtor padrão necessário para deserialização JSON
    public Cachorro() {
    }

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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return this.raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}