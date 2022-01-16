package br.com.techdive.batalhafinal;

import br.com.techdive.Personagem;
import br.com.techdive.enums.*;
import br.com.techdive.player.*;
import br.com.techdive.inimigo.*;

import java.util.Scanner;

public class BatalhaFinal {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Seja bem vindo(a) à BATALHA FINAL!");

            Jogador personagem = null;
            System.out.println("Digite o nome do seu personagem");
            String nomePersonagem = sc.nextLine();

            System.out.println("""
                    Selecione o sexo do seu personagem:\s
                    M - Masculino
                    F - Feminino""");

            String sexoPersonagem = sc.nextLine();

            System.out.println("""
                    Selecione a classe do seu personagem:\s
                    1 - Guerreiro
                    2 - Paladino
                    3 - Arqueiro
                    4 - Mago""");

            int op1 = sc.nextInt();

            switch (op1) {
                case 1 -> {
                    System.out.println("""
                            Selecione uma arma para seu guerreiro:\s
                            1 - Espada
                            2 - Machado""");

                    int op2 = sc.nextInt();
                    switch (op2) {
                        case 1 -> personagem = new Guerreiro(nomePersonagem, sexoPersonagem, Arma.Espada);
                        case 2 -> personagem = new Guerreiro(nomePersonagem, sexoPersonagem, Arma.Machado);
                    }
                }
                case 2 -> {
                    System.out.println("""
                            Selecione uma arma para seu paladino:\s
                            1 - Martelo
                            2 - Clava""");
                    int op2 = sc.nextInt();
                    switch (op2) {
                        case 1 -> personagem = new Paladino(nomePersonagem, sexoPersonagem, Arma.Martelo);
                        case 2 -> personagem = new Paladino(nomePersonagem, sexoPersonagem, Arma.Clava);
                    }
                }
                case 3 -> {
                    System.out.println("""
                            Selecione uma arma para seu arqueiro:\s
                            1 - Arco e flecha
                            2 - Besta""");
                    int op2 = sc.nextInt();
                    System.out.println(op2);
                    switch (op2) {
                        case 1 -> personagem = new Arqueiro(nomePersonagem, sexoPersonagem, Arma.Arco);
                        case 2 -> personagem = new Arqueiro(nomePersonagem, sexoPersonagem, Arma.Besta);
                    }
                }
                case 4 -> {
                    System.out.println("""
                            Selecione uma arma para seu mago:\s
                            1 - Cajado
                            2 - Livro de Magias""");
                    int op2 = sc.nextInt();
                    System.out.println(op2);
                    switch (op2) {
                        case 1 -> personagem = new Mago(nomePersonagem, sexoPersonagem, Arma.Cajado);
                        case 2 -> personagem = new Mago(nomePersonagem, sexoPersonagem, Arma.Besta);
                    }
                }
            }

            System.out.println("A noite se aproxima, a lua já surge no céu, estrelas vão se acendendo,\n"
                    + "e sob a luz do crepúsculo você está prestes a entrar na fase final da sua missão.\n"
                    + "Você olha para o portal à sua frente, e sabe que a partir desse ponto, sua vida mudará para sempre.");

            System.out.println("Memórias do caminho percorrido para chegar até aqui invadem sua mente.\n"
                    + "Você se lembra de todos os inimigos já derrotados para alcançar o covil do líder maligno.\n"
                    + "Olha para seu equipamento de combate, já danificado e desgastado depois de tantas lutas.\n"
                    + "Você está a um passo de encerrar para sempre esse mal.");

            System.out.println("Buscando uma injeção de ânimo, você se força a lembrar o que te trouxe até aqui.");

            System.out.println("""
                    Por que o seu personagem está nessa missão de destruir os inimigos?\s
                    1 - Vingança
                    2 - Glória""");
            int op3 = sc.nextInt();
            if (op3 == 1) {
                System.out.println("Imagens daquela noite trágica invadem sua mente.\n"
                        + "Você nem precisa se esforçar para lembrar, pois essas memórias estão sempre presentes,\n"
                        + "mesmo que de pano de fundo, quando você tem outros pensamentos em foco, elas nunca o deixaram.\n"
                        + "Elas são o combustível que te fizeram chegar até aqui.\n"
                        + "E você sabe que não irá desistir até ter vingado a morte\n"
                        + "daqueles que foram - e pra sempre serão - sua fonte de amor e desejo de continuar vivo.\n"
                        + "O maldito líder finalmente pagará por tanto mal causado na vida de tantos\n"
                        + "(e principalmente na sua).");

                personagem.setM(Motivacao.Vinganca);
            } else {

                System.out.println("Você já consegue visualizar na sua mente o povo da cidade te recebendo de braços abertos,\n"
                        + "bardos criando canções sobre seus feitos heróicos, nobres te presenteando com jóias e diversas riquezas,\n"
                        + "taberneiros se recusando a cobrar por suas bebedeiras e comilanças.\n"
                        + "Desde já, você sente o amor do público, te louvando a cada passo que dá pelas ruas,\n"
                        + "depois de destruir o vilão que tanto assombrou a paz de todos.\n"
                        + "Porém, você sabe que ainda falta o último ato dessa história.\n"
                        + "Você se concentra na missão.\n"
                        + "A glória o aguarda, mas não antes da última batalha.");
                personagem.setM(Motivacao.Gloria);
            }
            System.out.println("Inspirado pelo motivo que te trouxe até aqui, você sente seu coração ardendo em chamas,\n"
                    + "suas mãos formigarem em volta da sua arma. Você a segura com firmeza. Seu foco está renovado.\n"
                    + "Você avança pelo portal.");

            System.out.println("A escuridão te envolve. Uma iluminação muito fraca entra pelo portal às suas costas.\n"
                    + "À sua frente, só é possível perceber que você se encontra em um corredor extenso.\n"
                    + "Você só pode ir à frente, ou desistir.");

            System.out.println("""
                    O personagem seguira em frente ou ira desistir?\s
                    1 - Continuar
                    2 - Desistir""");

            int op4 = sc.nextInt();
            if (op4 == 2) {
                System.out.println("O medo invade o seu coração e você sente que ainda não está à altura do desafio.\n"
                        + "Você se volta para a noite lá fora, e corre em direção à segurança.");
                System.exit(0);
            } else {

                System.out.println("Você caminha, atento a todos os seus sentidos, por vários metros,\n"
                        + "até visualizar a frente uma fonte de luz, que você imagina ser a chama de uma tocha,\n"
                        + "vindo de dentro de uma porta aberta.");

                System.out.println("Você se pergunta se dentro dessa sala pode haver inimigos, ou alguma armadilha,\n"
                        + "e pondera sobre como passar pela porta.");

                System.out.println("""
                        Voce deseja passar pela porta:\s
                        1 - Andando cuidadosamente.
                        2 - Correndo
                        3 - Saltando""");
                int op5 = sc.nextInt();
                if (op5 == 3) {
                    System.out.println("Você se concentra e pula em direção à luz, saltando de antes da porta até o interior da sala.");
                } else if (op5 == 2) {
                    System.out.println("Você respira fundo e desata a correr em direção à sala.\n"
                            + "Quando passa pela porta, sente que pisou em uma pedra solta,\n"
                            + "mas não dá muita importância e segue para dentro da sala, olhando ao redor à procura de inimigos.\n"
                            + "Não tem ninguém, mas você ouve sons de flechas batendo na pedra atrás de você,\n"
                            + "e quando se vira, vê várias flechas no chão.\n"
                            + "Espiando pela porta, você entende que pisou em uma armadilha que soltou flechas de uma escotilha aberta no teto,\n"
                            + "mas por sorte você entrou correndo e conseguiu escapar desse ataque surpresa.");
                } else {
                    System.out.println("Você toma cuidado e vai caminhando vagarosamente em direção à luz.\n"
                            + "Quando você pisa exatamente embaixo da porta, você sente o chão ceder levemente, como se tivesse pisado em uma pedra solta.\n"
                            + "Você ouve um ruído de mecanismos se movimentando, e uma escotilha se abre no teto atrás de você, no corredor.\n"
                            + "Flechas voam da escotilha em sua direção, e você salta para dentro da sala, porém uma delas te acerta na perna.");

                    Armadilha a1 = new Armadilha();
                    a1.ataqueArmadilha(personagem);
                }
                System.out.println("Você se encontra sozinho em uma sala quadrada, contendo uma porta em cada parede.\n"
                        + "Uma delas foi aquela pela qual você entrou, que estava aberta, e as outras três estão fechadas.\n"
                        + "A porta à sua frente é a maior das quatro, com inscrições em seu entorno em uma língua que você não sabe ler,\n"
                        + "mas reconhece como sendo a língua antiga utilizada pelo inimigo.\n"
                        + "Você se aproxima da porta e percebe que ela está trancada por duas fechaduras douradas,\n"
                        + "e você entende que precisará primeiro derrotar o que estiver nas outras duas portas laterais,\n"
                        + "antes de conseguir enfrentar o líder.");

                System.out.println("Você se dirige para a porta à direita.");

                System.out.println("Você se aproxima, tentando ouvir o que acontece porta adentro, mas não escuta nada.\n"
                        + "Segura com mais força sua arma com uma mão, enquanto empurra a porta com a outra.\n"
                        + "Ao entrar, você se depara com uma sala espaçosa,\n"
                        + "com vários equipamentos de batalha pendurados nas paredes e dispostos em armários e mesas.\n"
                        + "Você imagina que este seja o arsenal do inimigo, onde estão guardados os equipamentos que seus soldados\n"
                        + "utilizam quando saem para espalhar o terror nas cidades e vilas da região.\n"
                        + "Enquanto seu olhar percorre a sala, você ouve a porta se fechando e gira rapidamente para olhar para trás.\n"
                        + "Ali, de pé entre você e a porta fechada, bloqueando o caminho do seu destino, está um dos capitães do inimigo.\n"
                        + "Um orque horrendo, de armadura, capacete e espada em punho, em posição de combate.\n"
                        + "Ele avança em sua direção.");

                Armeiro armeiro = new Armeiro();
                BatalhaFinal.combate(personagem, armeiro, 1);

                System.out.println("Após derrotar o inimigo.Armeiro, você percebe que seus equipamentos estão muito danificados.\n"
                        + "Olha em volta, encarando todas aquelas peças de armaduras resistentes e em ótimo estado.");

                System.out.println("""
                        Voce deseja pegar as armaduras do inimigo?\s
                        1 - Sim
                        2 - Não """);

                int op6 = sc.nextInt();
                if (op6 == 1) {
                    personagem.setPontosDeDefesa(personagem.getPontosDeDefesa() + 5);
                    System.out.println("Você resolve usar os equipamentos do inimigo contra ele, e trocar algumas peças suas,\n"
                            + "que estavam danificadas, pelas peças de armaduras existentes na sala.\n"
                            + "De armadura nova, você se sente mais protegido para os desafios à sua frente.");
                    System.out.printf("Sua armadura agora é %d\n", personagem.getPontosDeDefesa());
                } else {
                    System.out.println("Você decide que não precisa utilizar nada que venha das mãos do inimigo.");
                }

                System.out.println("Em uma mesa, você encontra uma chave dourada, e sabe que aquela chave abre uma das fechaduras da porta do líder inimigo.\n"
                        + "Você pega a chave e guarda numa pequena bolsa que leva presa ao cinto.");

                System.out.println("Você retorna à sala anterior e se dirige à porta da esquerda.\n"
                        + "Você se aproxima, tentando ouvir o que acontece porta adentro, mas não escuta nada.\n"
                        + "Segura com mais força sua arma com uma mão, enquanto empurra a porta com a outra.\n"
                        + "Ao entrar, você se depara com uma sala parecida com a do arsenal, mas em vez de armaduras,\n"
                        + "existem vários potes e garrafas de vidro com conteúdos misteriosos e de cores diversas,\n"
                        + "e você entende que o capitão que vive ali, realiza experimentos com diversos ingredientes,\n"
                        + "criando poções utilizadas pelos soldados para aterrorizar a região.");

                System.out.println("No fundo da sala, olhando em sua direção, está outro dos capitães do inimigo.\n"
                        + "Um orque horrendo, de armadura, cajado em punho, em posição de combate. Ele avança em sua direção.");

                Alquimista alquimista = new Alquimista();
                BatalhaFinal.combate(personagem, alquimista, 1);

                System.out.println("Após derrotar o inimigo.Alquimista, você olha em volta, tentando reconhecer alguma poção do estoque do inimigo.\n"
                        + "Em uma mesa, você reconhece uma pequena garrafa de vidro contendo um líquido levemente rosado,\n"
                        + "pega a garrafa e pondera se deve beber um gole.");

                System.out.println("""
                        Voce deseja usar a poção do inimigo?\s
                        1 - Sim
                        2 - Não """);

                int op7 = sc.nextInt();
                if (op7 == 1) {
                    personagem.setPontosDeSaude(200);
                    System.out.println("Você se sente revigorado para seguir adiante!");
                } else {
                    System.out.println("Você fica receoso de beber algo produzido pelo inimigo.");
                }

                System.out.println("Ao lado da porta, você vê uma chave dourada em cima de uma mesa,\n"
                        + "e sabe que aquela chave abre a outra fechadura da porta do líder inimigo.\n"
                        + "Você pega a chave e guarda na pequena bolsa que leva presa ao cinto.");

                System.out.println("De volta à sala das portas, você se dirige à porta final.\n"
                        + "Coloca as chaves nas fechaduras, e a porta se abre.\n"
                        + "Seu coração acelera, memórias de toda a sua vida passam pela sua mente,\n"
                        + "e você percebe que está muito próximo do seu objetivo final.\n"
                        + "Segura sua arma com mais firmeza, foca no combate que você sabe que irá se seguir, e adentra a porta.");

                System.out.println("Lá dentro, você vê o líder sentado em uma poltrona dourada, com duas fogueiras de cada lado, e prisioneiros acorrentados às paredes.");

                System.out.println("Ele percebe sua chegada e se levanta com um salto, apanhando seu machado de guerra de lâmina dupla.");

                System.out.println("""
                        Voce deseja esperar ou atacar primeiro?\s
                        1 - Esperar.
                        2 - Atacar primeiro. """);
                int op8 = sc.nextInt();
                Lider lider = new Lider();
                if (op8 == 1) {
                    BatalhaFinal.combate(personagem, lider, 1);
                } else {
                    BatalhaFinal.combate(personagem, lider, 2);
                }
                System.out.println("Você conseguiu!");

                if(personagem.getM()==Motivacao.Vinganca){
                    System.out.println("""
                     Você obteve sua vingança.\s
                     Você se ajoelha e cai no choro, invadido por uma sensação de alívio e felicidade.
                     Você se vingou, tudo que sempre quis, está feito.
                     Agora você pode seguir sua vida.""");
                }
                if(personagem.getM()==Motivacao.Gloria){
                    System.out.println("""
                     O êxtase em que você se encontra não cabe dentro de si.\s
                     Você se ajoelha e grita de alegria.
                     A glória o aguarda, você a conquistou.""");
                }

                System.out.println("Você se levanta, olha para os prisioneiros, vai de um em um e os liberta,\n"
                        + "e todos vocês saem em direção à noite, retornando à cidade.\n"
                        + "Seu dever está cumprido.");
            }
    }
    private static void combate(Jogador a, Inimigo b, int idComeca) {
        boolean repetir = true;
        if(idComeca == 1){
            do{
                if(checkCombate(a, b)){
                    repetir = false;
                }else {
                    b.atacar(b, a);
                    if(checkCombate(a,b)){
                        repetir = false;
                    }else{
                    System.out.println("""
                        O personagem seguira em frente ou ira desistir?\s
                        1 - Continuar
                        2 - Desistir""");
                    int op = sc.nextInt();
                    if (op == 2) {
                        System.exit(0);
                    } else {
                        a.atacar(a, b);
                        }
                    }
                }
            }while (repetir);
        }else{
            a.atacar(b,a);
            do{
                if(checkCombate(a, b)){
                    repetir = false;
                }else {
                    b.atacar(b, a);
                    if(checkCombate(a,b)){
                        repetir = false;
                    }else{
                    System.out.println("""
                        O personagem seguira em frente ou ira desistir?\s
                        1 - Continuar
                        2 - Desistir""");
                    int op = sc.nextInt();
                    if (op == 2) {
                        System.exit(0);
                    } else {
                        a.atacar(a, b);
                        }
                    }
                }
            }while (repetir);
        }


    }
    private static boolean checkCombate(Jogador a, Inimigo b){
        boolean fim = false;
        if(b.getPontosDeSaude()<=0){
            System.out.println("O inimigo não é páreo para o seu heroísmo, e jaz imóvel aos seus pés.");
            fim = true;
        }else if(a.getPontosDeSaude()<=0) {
            if (a.getM().getNomeMotivacao().equals("Gloria") && Jogador.getSexo(a).equals("M")) {
                System.out.println("A glória que buscavas não será sua, e a cidade aguarda por seu próximo herói.");
                fim = true;
                System.exit(0);
            } else if (a.getM().getNomeMotivacao().equals("Gloria") && Jogador.getSexo(a).equals("F")) {
                System.out.println("A glória que buscavas não será sua, e a cidade aguarda por sua próxima heroína.");
                fim = true;
                System.exit(0);
            } else if (a.getM().getNomeMotivacao().equals("Vinganca")) {
                System.out.println("Não foi possível concluir sua vingança, e agora resta saber se alguém se vingará por você");
                fim = true;
                System.exit(0);
            }
        }
        return fim;
    }
}
