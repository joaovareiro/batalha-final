package br.com.techdive.inimigo;

import br.com.techdive.Personagem;
import br.com.techdive.enums.Arma;

import java.util.Random;

public class Armeiro extends Inimigo {
    private static final int SAUDE_MAXIMA = 100;
    private Random random = new Random();

    public Armeiro() {
        super(10, 15,  Arma.Espada);
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
            if(danoAplicado<=0){
                System.out.println("O inimigo atacou! mas sua armadura te protegeu do ataque");
            }else{
                defensor.setPontosDeSaude(defensor.getPontosDeSaude() - danoAplicado);
                System.out.printf("O inimigo atacou! Você sofreu %d de dano e agora possui %d pontos de vida.\n", danoAplicado, defensor.getPontosDeSaude());
            }

        }
    }
}
