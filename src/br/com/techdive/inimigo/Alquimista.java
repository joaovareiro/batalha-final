package br.com.techdive.inimigo;

import br.com.techdive.Personagem;
import br.com.techdive.enums.Arma;

import java.util.Random;

public class Alquimista extends Inimigo {
    private Random random = new Random();
    private static final int SAUDE_MAXIMA = 100;

    public Alquimista(Arma a) {
        super(15, 10,a);
    }

    @Override
    public void atacar(Personagem atacante, Personagem defensor) {

        int danoPotencial = atacante.getPontosDeAtaque() + 5 + random.nextInt(20);

        if (danoPotencial == atacante.getPontosDeAtaque() + 5 + 1) {
            System.out.println("Seu inimigo errou o ataque");

        } else if (danoPotencial == atacante.getPontosDeAtaque() + 5 + 20) {
            System.out.printf("O inimigo acertou um ataque crítico! Você sofreu %d de dano e agora possui %d pontos de vida.", danoPotencial, defensor.getPontosDeSaude());
        } else {
            int danoAplicado = danoPotencial - defensor.getPontosDeDefesa();
            System.out.printf("O inimigo atacou! Você sofreu %d de dano e agora possui %d pontos de vida.", danoPotencial, defensor.getPontosDeSaude());
        }
        if(atacante.getPontosDeSaude()==0){
            System.out.println("O inimigo não é páreo para o seu heroísmo, e jaz imóvel aos seus pés.");
        }

    }

}