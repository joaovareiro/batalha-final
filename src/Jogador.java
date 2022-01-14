import java.util.Locale;

public abstract class Jogador extends Personagem implements Atacante{

    private String nome;
    private String sexo;
    private Motivacao m;
    private Arma a;
    private static final int SAUDE_MAXIMA = 200;

    //Jogador deve validar no construtor se o nome e o sexo estão corretamente preenchidos.
    // Nome só não pode ser vazio, e sexo precisa ser M ou F.

    public Jogador(int pontosDeSaude, int pontosDeAtaque, int pontosDeDefesa, String nome, String sexo, Motivacao m, Arma a) {
        super(pontosDeSaude, pontosDeAtaque, pontosDeDefesa);
            this.m = m;
            this.a = a;
    }


    //usa o metodo confereJogador na main pra validar
    public static boolean confereJogador(String nomeConfere, String sexoConfere){
        if(nomeConfere.isEmpty()||nomeConfere.isBlank()||nomeConfere==null){
            throw new IllegalArgumentException("O nome do jogador nao pode ser vazio.");
        }else {
            if (sexoConfere.toUpperCase().equals("M") || (sexoConfere.toUpperCase().equals("F"))) {
                return true;
            } else {
                throw new IllegalArgumentException("O sexo so pode ser M ou F");
            }
        }
    }

    public boolean confereArma(Arma a){
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
    public void atacar(Personagem p) {

    }
}
