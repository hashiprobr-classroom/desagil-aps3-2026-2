package br.edu.insper.desagil.aps3.farol;

public class Inimigo extends Personagem {
    private Farol origem;
    private boolean movel;

    public Inimigo(int x, int y, int power, int health, Farol origem) {
        super(x, y, power, health);
        this.origem = origem;
        this.movel = true;
    }

    public Farol getOrigem() {
        return origem;
    }

    public void paralisa() {
        movel = false;
    }

    public void liberta() {
        movel = true;
    }

    @Override
    public void movimenta(int dx, int dy) {
        if (movel) {
            super.movimenta(dx, dy);
        }
    }
}
