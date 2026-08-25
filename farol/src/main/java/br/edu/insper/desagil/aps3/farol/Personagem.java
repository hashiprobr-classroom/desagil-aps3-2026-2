package br.edu.insper.desagil.aps3.farol;

public abstract class Personagem extends Elemento {
    private int ataque;

    public Personagem(int x, int y, int energia, int ataque) {
        super(x, y, energia, 1, 1);
        this.ataque = ataque;
    }

    public int getAtaque() {
        return ataque;
    }

    public void movimenta(int dx, int dy) {
        movimentaHorizontal(dx);
        movimentaVertical(dy);
    }

    private void movimentaHorizontal(int dx) {
        setX(getX() + dx);
    }

    private void movimentaVertical(int dy) {
        setY(getY() + dy);
    }
}
