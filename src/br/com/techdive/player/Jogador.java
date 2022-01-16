package br.com.techdive.player;

import br.com.techdive.Personagem;
import br.com.techdive.batalhafinal.Atacante;
import br.com.techdive.enums.Arma;
import br.com.techdive.enums.Motivacao;

import java.util.Scanner;

public abstract class Jogador extends Personagem implements Atacante {

    private String nome;
    private String sexo;
    private Motivacao m;
    private Arma a;
    private static final int SAUDE_MAXIMA = 200;

    //player.Jogador deve validar no construtor se o nome e o sexo estão corretamente preenchidos.
    // Nome só não pode ser vazio, e sexo precisa ser M ou F.

    public Jogador(int pontosDeAtaque, int pontosDeDefesa, String nome, String sexo, Arma a){
        super(SAUDE_MAXIMA, pontosDeAtaque, pontosDeDefesa);
        this.a = a;
            if(nome.isEmpty() || nome.isBlank()) {
                System.err.println("O nome do personagem nao pode ser vazio.");
                solicitarNome();
                if(sexo.isBlank()){
                    System.err.println("O sexo do personagem nao pode ser vazio.");
                    solicitarSexo();
                } else if (!sexo.equalsIgnoreCase("M")&&!sexo.equalsIgnoreCase("F")) {
                    System.err.println("O sexo so pode ser M ou F");
                    solicitarSexo();
                }else{
                    this.sexo = sexo;
                }
            } else if(sexo.isBlank()){
                System.err.println("O sexo do personagem nao pode ser vazio.");
                this.nome = nome;
                solicitarSexo();
            } else if (!sexo.equalsIgnoreCase("M")&&!sexo.equalsIgnoreCase("F")) {
                System.err.println("O sexo so pode ser M ou F");
                this.nome = nome;
                solicitarSexo();
            }else {
                this.nome = nome;
                this.sexo = sexo;
            }
    }

    public void solicitarNome(){
        Scanner sc = new Scanner(System.in);
        boolean nomeInvalido = true;
        while (nomeInvalido){
            System.out.println("Por favor, digite um nome valido");
            String nomeTeste = sc.nextLine();
            if(nomeTeste.isEmpty()||nomeTeste.isBlank()){
                nomeInvalido = true;
            }else{
                this.nome = nomeTeste;
                nomeInvalido = false;
            }
        }
    }

    public void solicitarSexo(){
        Scanner sc = new Scanner(System.in);
        boolean sexoInvalido = true;
        while (sexoInvalido) {
            System.out.println("Por favor, digite um sexo valido (M ou F)");
            String sexoTeste = sc.next();
            if(sexoTeste==null) {
                System.err.println("O sexo nao pode ser vazio");
            }else if(!sexoTeste.equalsIgnoreCase("M")&&!sexoTeste.equalsIgnoreCase("F")){
                System.err.println("O sexo so pode ser M ou F");
            }else{
                this.sexo = sexoTeste;
                sexoInvalido = false;
            }
        }
    }


    public void setM(Motivacao m) {
        this.m = m;
    }

    public Motivacao getM() {
        return m;
    }

    public String getNome() {
        return nome;
    }

    public String getSexoJogador() {
        return sexo;
    }

    public Arma getA() {
        return a;
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

