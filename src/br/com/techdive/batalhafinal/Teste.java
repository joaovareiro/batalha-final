package br.com.techdive.batalhafinal;

import br.com.techdive.enums.Arma;
import br.com.techdive.inimigo.Armadilha;
import br.com.techdive.player.Guerreiro;

import java.util.Scanner;

public class Teste {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

//        System.out.println("Digite o nome do seu personagem");
//        String nomePersonagem = sc.nextLine();
//        System.out.println("""
//                    Selecione o sexo do seu personagem:\s
//                    M - Masculino
//                    F - Feminino""");
//
//        String sexoPersonagem = sc.nextLine();
        Guerreiro g1 = new Guerreiro("cebolao","M", Arma.Espada);
         //System.out.println(g1.toString());
        Armadilha a = new Armadilha();
        a.ataqueArmadilha(g1);
        System.out.println(g1.getPontosDeSaude());
    }
}
