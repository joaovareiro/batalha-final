package br.com.techdive.player;

import br.com.techdive.Personagem;
import br.com.techdive.batalhafinal.Atacante;
import br.com.techdive.enums.Arma;
import br.com.techdive.enums.Motivacao;

public abstract class Jogador extends Personagem implements Atacante {

    private String nome;
    private String sexo;
    private Motivacao m;
    private Arma a;
    private static final int SAUDE_MAXIMA = 200;

    //player.Jogador deve validar no construtor se o nome e o sexo estão corretamente preenchidos.
    // Nome só não pode ser vazio, e sexo precisa ser M ou F.

    public Jogador(int pontosDeAtaque, int pontosDeDefesa, String nome, String sexo, Arma a) throws IllegalArgumentException {
        super(SAUDE_MAXIMA, pontosDeAtaque, pontosDeDefesa);
        boolean repetir = true;
        do{
            if(nome.isEmpty() || nome.isBlank()) {
                throw new IllegalArgumentException("O nome do personagem nao pode ser vazio.");

            }else if (!sexo.equalsIgnoreCase("M")&&!sexo.equalsIgnoreCase("F")) {
                throw new IllegalArgumentException("O sexo so pode ser M ou F");
            }
            else if(sexo.isBlank()){
                throw new IllegalArgumentException("O sexo do personagem nao pode ser vazio.");
            }else{
                this.a = a;
                repetir = false;
            }
        }while (repetir);
    }

    public void setM(Motivacao m) {
        this.m = m;
    }

    public Motivacao getM() {
        return m;
    }

    public static String getNomeArma(Jogador j) {
        return j.a.getNomeArma();
    }

    public static String getSexo(Jogador j) {
        return j.sexo;
    }

    public boolean confereArma(Personagem p , Arma a){
        boolean conferido = false;
        if(this instanceof Arqueiro){
            if(a == Arma.Besta || a == Arma.Arco){
                conferido = true;
            }
        }else if(this instanceof Guerreiro){
            if(a == Arma.Espada || a == Arma.Machado){
                conferido = true;
            }
        }else if(this instanceof Mago){
            if(a == Arma.Cajado || a == Arma.livroDeMagias){
                conferido = true;
            }
        }else if(this instanceof Paladino){
            if(a == Arma.Martelo || a == Arma.Clava){
                conferido = true;
            }
        }
        return conferido;
    }

    @Override
    public void atacar(Personagem atacante, Personagem defensor) {
    }

    @Override
    public String toString() {
        return "player.Jogador{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", m=" + m +
                ", a=" + a +
                '}';
    }
}

