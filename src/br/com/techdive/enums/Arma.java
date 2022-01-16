package br.com.techdive.enums;

public enum Arma {
    Espada("Espada",1,5),Machado("Machado",2,5),
    Martelo("Machado",3,5), Clava("Clava",4,5),
    Arco("Arco+flecha",5,5), Besta("Besta+virote",6,5),
    Cajado("Cajado",7,5), livroDeMagias("Livro de Magias",8,5),
    Armadilha("inimigo.Armadilha",9,2),MachadoDuplo("Machado Duplo",10,7);

    private String nomeArma;
    private int valor;
    private int dano;

    Arma(String nomeArma, int valor, int dano){
        this.nomeArma = nomeArma;
        this.valor = valor;
        this.dano = dano;
    }

    public int getDano() {
        return dano;
    }

    public String getNomeArma() {
        return nomeArma;
    }
}
