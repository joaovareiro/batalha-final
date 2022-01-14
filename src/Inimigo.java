public abstract class Inimigo extends Personagem implements Atacante{

    private Arma a;

    public Inimigo(int pontosDeSaude, int pontosDeAtaque, int pontosDeDefesa, Arma a) {
        super(pontosDeSaude, pontosDeAtaque, pontosDeDefesa);
        this.a = a;
    }
}
