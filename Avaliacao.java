package com.example.newacademic;

public class Avaliacao {

    private int codAvaliacao;
    private float nota;
    private String dataAvaliacao;

    public Avaliacao(int codAvaliacao, float nota, String dataAvaliacao) {
        this.codAvaliacao = codAvaliacao;
        this.nota = nota;
        this.dataAvaliacao = dataAvaliacao;
    }

    public int getCodAvaliacao() {
        return codAvaliacao;
    }

    public void setCodAvaliacao(int codAvaliacao) {
        this.codAvaliacao = codAvaliacao;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getDataAvaliacao() {
        return dataAvaliacao;
    }

    public void setDataAvaliacao(String dataAvaliacao) {
        this.dataAvaliacao = dataAvaliacao;
    }
}
