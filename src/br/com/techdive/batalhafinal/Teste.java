package br.com.techdive.batalhafinal;

import br.com.techdive.enums.Arma;
import br.com.techdive.player.Guerreiro;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do seu personagem");
        String nomePersonagem = sc.nextLine();
        System.out.println("""
                    Selecione o sexo do seu personagem:\s
                    M - Masculino
                    F - Feminino""");

        String sexoPersonagem = sc.nextLine();
        Guerreiro g1 = new Guerreiro(nomePersonagem,sexoPersonagem, Arma.Espada);
        System.out.println(g1.toString());
    }
}
