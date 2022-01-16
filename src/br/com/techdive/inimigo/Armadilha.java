package br.com.techdive.inimigo;

import br.com.techdive.Personagem;
import br.com.techdive.batalhafinal.Atacante;
import br.com.techdive.enums.Arma;

import java.util.Random;

public class Armadilha implements Atacante {
    private Random random = new Random();
    private int pontosDeAtaque;
    private Arma a;

    public Armadilha() {
        pontosDeAtaque = 5;
        Arma a = Arma.Armadilha;
    }

    @Override
    public void atacar(Personagem atacante, Personagem defensor) {

    }

    public void ataqueArmadilha(Personagem defensor){
        int danoPotencial = pontosDeAtaque + Arma.Armadilha.getDano()+ random.nextInt(10);

        if(danoPotencial == pontosDeAtaque + Arma.Armadilha.getDano() + 1){
            System.out.println("O ataque da armadilha pegou de raspão e você não sofreu dano.");
        }else{
            int danoAplicado = danoPotencial - defensor.getPontosDeDefesa();
            defensor.setPontosDeSaude(defensor.getPontosDeSaude()-danoAplicado);
            System.out.printf("Você sofreu %d de dano e agora possui %d pontos de vida.",danoAplicado,defensor.getPontosDeSaude());
        }
    }
}
