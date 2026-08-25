package br.edu.insper.desagil.aps3.farol;

import java.util.List;

public class Farol extends Elemento {
    private List<Amigo> amigos;

    public Farol(int x, int y, int energia, List<Amigo> amigos) {
        super(x, y, 3, 3, energia);
        this.amigos = amigos;
    }

    public List<Amigo> getAmigos() {
        return amigos;
    }

    public void ganha(Amigo amigo) {
        amigos.add(amigo);
    }

    public void perde(int indice) {
        amigos.remove(indice);
    }
}
