package br.com.techdive.inimigo;

import br.com.techdive.Personagem;
import br.com.techdive.enums.Arma;

import java.util.Random;

public class Alquimista extends Inimigo {
    private Random random = new Random();
    private static final int SAUDE_MAXIMA = 100;

    public Alquimista() {
        super(15, 10,Arma.Cajado);
        this.setPontosDeSaude(100);
    }

    @Override
    public void atacar(Personagem atacante, Personagem defensor) {

        int danoPotencial = atacante.getPontosDeAtaque() + 5 + random.nextInt(20);

        if (danoPotencial == atacante.getPontosDeAtaque() + 5 + 1) {
            System.out.println("Seu inimigo errou o ataque");

        } else if (danoPotencial == atacante.getPontosDeAtaque() + 5 + 20) {
            defensor.setPontosDeSaude(defensor.getPontosDeSaude() - danoPotencial);
            System.out.printf("O inimigo acertou um ataque crítico! Você sofreu %d de dano e agora possui %d pontos de vida.\n", danoPotencial, defensor.getPontosDeSaude());
        } else {
            int danoAplicado = danoPotencial - defensor.getPontosDeDefesa();
            defensor.setPontosDeSaude(defensor.getPontosDeSaude() - danoAplicado);
            System.out.printf("O inimigo atacou! Você sofreu %d de dano e agora possui %d pontos de vida.\n", danoPotencial, defensor.getPontosDeSaude());
        }
    }
}