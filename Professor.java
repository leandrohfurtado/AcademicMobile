package com.example.newacademic;

public class Professor extends Pessoa {

    private String matricula;

    public Professor(String nome, String endereco, String estado, String municipio, String email, String senha, String matricula) {
        super(nome, endereco, estado, municipio, email, senha);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
