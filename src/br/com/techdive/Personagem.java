package br.com.techdive;

public class Personagem {
    private int pontosDeSaude;
    private int pontosDeAtaque;
    private int pontosDeDefesa;

    public Personagem(int pontosDeSaude, int pontosDeAtaque, int pontosDeDefesa) {
        this.pontosDeSaude = pontosDeSaude;
        this.pontosDeAtaque = pontosDeAtaque;
        this.pontosDeDefesa = pontosDeDefesa;
    }

    public int getPontosDeSaude() {
        return pontosDeSaude;
    }

    public int getPontosDeAtaque() {
        return pontosDeAtaque;
    }

    public int getPontosDeDefesa() {
        return pontosDeDefesa;
    }

    public void setPontosDeSaude(int pontosDeSaude) {
        this.pontosDeSaude = pontosDeSaude;
    }

    public void setPontosDeDefesa(int pontosDeDefesa) {
        this.pontosDeDefesa = pontosDeDefesa;
    }
}
