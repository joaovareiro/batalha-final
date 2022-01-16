package br.com.techdive.player;

import br.com.techdive.Personagem;
import br.com.techdive.enums.Arma;
import br.com.techdive.enums.Motivacao;
import br.com.techdive.inimigo.Inimigo;

import java.util.Objects;
import java.util.Random;

public class Guerreiro extends Jogador {
    private Random random = new Random();

    public Guerreiro(String nome, String sexo, Arma a) {
        super(15, 15, nome, sexo, a);
    }

    @Override
    public void atacar(Personagem atacante, Personagem defensor) {

        int danoPotencial = atacante.getPontosDeAtaque() + 5 + random.nextInt(20);

        if (danoPotencial == atacante.getPontosDeAtaque() + 5 + 1) {
                System.out.println("Você errou seu ataque! O inimigo não sofreu dano algum.");
        } else if (danoPotencial == atacante.getPontosDeAtaque() + 5 + 20) {
                System.out.println("Você acertou um ataque crítico!");
                if (Objects.equals(Jogador.getNomeArma(this), Arma.Espada.getNomeArma()))
                    System.out.printf("Você atacou com a espada e causou %d de dano no inimigo!\n", danoPotencial);
                else {
                    System.out.printf("Você atacou com o machado e causou %d de dano no inimigo!\n", danoPotencial);
            }
        } else {
            int danoAplicado = danoPotencial - defensor.getPontosDeDefesa();
                defensor.setPontosDeSaude(defensor.getPontosDeSaude() - danoAplicado);
                if (Objects.equals(Jogador.getNomeArma(this), Arma.Espada.getNomeArma()))
                    System.out.printf("Você atacou com a sua espada e causou %d de dano no inimigo!\n", danoAplicado);
                else {
                    System.out.printf("Você atacou com o seu machado e causou %d de dano no inimigo!\n", danoAplicado);
            }
        }
    }
}
