package com.example.newacademic;

public class Curso {

    private String nomeCurso;
    private int codCurso;

    public Curso(String nomeCurso, int codCurso) {
        this.nomeCurso = nomeCurso;
        this.codCurso = codCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

}
