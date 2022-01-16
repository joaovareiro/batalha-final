package br.com.techdive.enums;

public enum Motivacao {
    Vinganca(1,"Vinganca"),Gloria(2,"Gloria");

    private int valor;
    private String nomeMotivacao;

    Motivacao(int valor, String nomeMotivacao){
        this.valor = valor;
        this.nomeMotivacao = nomeMotivacao;
    }

    public String getNomeMotivacao() {
        return nomeMotivacao;
    }
}
