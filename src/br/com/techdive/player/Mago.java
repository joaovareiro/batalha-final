package br.com.techdive.player;

import br.com.techdive.Personagem;
import br.com.techdive.enums.Arma;
import br.com.techdive.enums.Motivacao;
import br.com.techdive.inimigo.Inimigo;

import java.util.Objects;
import java.util.Random;

public class Mago extends Jogador {
    private Random random = new Random();

    public Mago(String nome, String sexo, Arma a) {
        super(19, 11, nome, sexo, a);
    }

    @Override
    public void atacar(Personagem atacante, Personagem defensor) {

        int danoPotencial = atacante.getPontosDeAtaque() + 5 + random.nextInt(20);

        if (danoPotencial == atacante.getPontosDeAtaque() + 5 + 1) {
                System.out.println("Você errou seu ataque! O inimigo não sofreu dano algum.");
        } else if (danoPotencial == atacante.getPontosDeAtaque() + 5 + 20) {
                System.out.println("Você acertou um ataque crítico!");
                if (Objects.equals(Jogador.getNomeArma(this), Arma.Cajado.getNomeArma()))
                    System.out.printf("Você atacou com seu cajado, lançando uma bola de fogo e causou %d de dano no inimigo!\n", danoPotencial);
                else {
                    System.out.printf("Você atacou absorvendo energia do livro com uma mão e liberando com a outra e causou %d de dano no inimigo!\n", danoPotencial);
            }
        } else {
            int danoAplicado = danoPotencial - defensor.getPontosDeDefesa();
                defensor.setPontosDeSaude(defensor.getPontosDeSaude() - danoAplicado);
                if (Objects.equals(Jogador.getNomeArma(this), Arma.Cajado.getNomeArma()))
                    System.out.printf("Você atacou com seu cajado, lançando uma bola de fogo e causou %d de dano no inimigo!\n", danoAplicado);
                else {
                    System.out.printf("Você atacou absorvendo energia do livro com uma mão e liberando com a outra e causou %d de dano no inimigo!\n", danoAplicado);
            }
        }
    }
}