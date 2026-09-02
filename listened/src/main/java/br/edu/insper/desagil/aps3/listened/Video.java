package br.edu.insper.desagil.aps3.listened;

public class Video {
    private int indice;
    private int duracao;
    private String titulo;

    public Video(int indice, int duracao) {
        this.indice = indice;
        this.duracao = duracao;
        this.titulo = "";
    }

    public int getIndice() {
        return indice;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String identificacao() {
        String s;
        if (titulo.isEmpty()) {
            s = "[sem título]";
        } else {
            s = titulo;
        }

        s += " (" + (duracao / 60) + ":";

        int m = duracao % 60;
        if (m < 10) {
            s += "0";
        }

        return s + m + ")";
    }
}
