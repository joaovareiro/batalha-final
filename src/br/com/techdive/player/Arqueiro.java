package br.com.techdive.player;

import br.com.techdive.Personagem;
import br.com.techdive.enums.Arma;
import br.com.techdive.enums.Motivacao;
import br.com.techdive.inimigo.Inimigo;

import java.util.Objects;
import java.util.Random;

public class Arqueiro extends Jogador {
    private Random random = new Random();

    public Arqueiro(String nome, String sexo, Arma a) throws IllegalArgumentException {
        super(18, 13, nome, sexo, a);
    }

    @Override
    public void atacar(Personagem atacante, Personagem defensor) {

        int danoPotencial = atacante.getPontosDeAtaque() + 5 + random.nextInt(20);

        if(danoPotencial == atacante.getPontosDeAtaque() + 5 + 1) {
            if (atacante instanceof Inimigo) {
                System.out.println("Seu inimigo errou o ataque");
            }
            if (atacante instanceof Jogador) {
                System.out.println("Você errou seu ataque! O inimigo não sofreu dano algum.");
            }
        }else if(danoPotencial == atacante.getPontosDeAtaque() + 5+ 20) {
            if (atacante instanceof Inimigo) {
                System.out.printf("O inimigo acertou um ataque crítico! Você sofreu %d de dano e agora possui %d pontos de vida.", danoPotencial, defensor.getPontosDeSaude());
            }
            if (atacante instanceof Jogador) {
                System.out.println("Você acertou um ataque crítico!");
                if (Objects.equals(Jogador.getNomeArma(this), Arma.Arco.getNomeArma()))
                    System.out.printf("Você atacou com seu arco e flecha e causou %d de dano no inimigo!\n", danoPotencial);
                else {
                    System.out.printf("Você atacou com sua besta e virote e causou %d de dano no inimigo!\n", danoPotencial);
                }
            }
        }else{
            int danoAplicado = danoPotencial - defensor.getPontosDeDefesa();
            if (atacante instanceof Inimigo) {
                System.out.printf("O inimigo atacou! Você sofreu %d de dano e agora possui %d pontos de vida.", danoPotencial, defensor.getPontosDeSaude());
            }
            if (atacante instanceof Jogador) {
                defensor.setPontosDeSaude(defensor.getPontosDeSaude()-danoAplicado);
                if(Objects.equals(Jogador.getNomeArma(this), Arma.Arco.getNomeArma()))
                    System.out.printf("Você atacou com seu arco e flecha e causou %d de dano no inimigo!\n",danoAplicado);
                else{
                    System.out.printf("Você atacou com sua besta e virote e causou %d de dano no inimigo!\n",danoAplicado);
                }
            }
        }

        if(atacante instanceof Inimigo && atacante.getPontosDeSaude()==0){
            System.out.println("O inimigo não é páreo para o seu heroísmo, e jaz imóvel aos seus pés.");
        }else if(atacante instanceof Jogador && atacante.getPontosDeSaude()==0) {
            if (this.getM().getNomeMotivacao().equals(Motivacao.Gloria.getNomeMotivacao()) && Jogador.getSexo(this).equals("M")) {
                System.out.println("A glória que buscavas não será sua, e a cidade aguarda por seu próximo herói.");
            } else if (this.getM().getNomeMotivacao().equals(Motivacao.Gloria.getNomeMotivacao()) && Jogador.getSexo(this).equals("F")) {
                System.out.println("A glória que buscavas não será sua, e a cidade aguarda por sua próxima heroína.");
            } else if (this.getM().getNomeMotivacao().equals(Motivacao.Vinganca.getNomeMotivacao())) {
                System.out.println("Não foi possível concluir sua vingança, e agora resta saber se alguém se vingará por você");
            }
        }

    }
}
