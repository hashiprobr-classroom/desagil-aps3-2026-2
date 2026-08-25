package br.edu.insper.desagil.aps3.farol;

public abstract class Elemento {
    private int x;
    private int y;
    private int largura;
    private int altura;
    private int energia;

    public Elemento(int x, int y, int largura, int altura, int energia) {
        this.x = x;
        this.y = y;
        this.largura = largura;
        this.altura = altura;
        this.energia = energia;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getLargura() {
        return largura;
    }

    public int getAltura() {
        return altura;
    }

    public int getEnergia() {
        return energia;
    }

    public void danifica(int perda) {
        energia -= perda;
    }

    public void conserta(int ganho) {
        energia += ganho;
    }
}
