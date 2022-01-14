public class Armadilha implements Atacante{

    private int pontosDeAtaque;
    private Arma a;

    public Armadilha() {
        pontosDeAtaque = 5;
        Arma a = Arma.Armadilha;
    }

    @Override
    public void atacar(Personagem p) {

    }
}
