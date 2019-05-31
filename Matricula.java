package com.example.newacademic;

public class Matricula {

    private int codMatricula;
    private String dataMatricula;

    public Matricula(int codMatricula, String dataMatricula) {
        this.codMatricula = codMatricula;
        this.dataMatricula = dataMatricula;
    }

    public int getCodMatricula() {
        return codMatricula;
    }

    public void setCodMatricula(int codMatricula) {
        this.codMatricula = codMatricula;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

}
