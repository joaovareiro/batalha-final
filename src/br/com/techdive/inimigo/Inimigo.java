package br.com.techdive.inimigo;

import br.com.techdive.Personagem;
import br.com.techdive.batalhafinal.Atacante;
import br.com.techdive.enums.Arma;

public abstract class Inimigo extends Personagem implements Atacante {

    private Arma a;
    private static final int SAUDE_MAXIMA = 200;

    public Inimigo(int pontosDeAtaque, int pontosDeDefesa, Arma a) {
        super(SAUDE_MAXIMA, pontosDeAtaque, pontosDeDefesa);
        this.a = a;
    }
}
