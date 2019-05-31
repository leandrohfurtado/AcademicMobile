package com.example.newacademic;

public class Pessoa {

    private String nome;
    private String endereco;
    private String estado;
    private String municipio;
    private String email;
    private String senha;

    public Pessoa(String nome, String endereco, String estado, String municipio, String email, String senha) {
        this.nome = nome;
        this.endereco = endereco;
        this.estado = estado;
        this.municipio = municipio;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
