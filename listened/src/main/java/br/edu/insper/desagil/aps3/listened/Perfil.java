package br.edu.insper.desagil.aps3.listened;

import java.util.*;

public class Perfil {
    private Pessoa pessoa;
    private Map<Integer, Boolean> interacoes;

    public Perfil(Pessoa pessoa) {
        this.pessoa = pessoa;
        this.interacoes = new HashMap<>();
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void ama(Video video) {
        interacoes.put(video.getIndice(), true);
    }

    public void odeia(Video video) {
        interacoes.put(video.getIndice(), false);
    }

    public int total() {
        return interacoes.size();
    }

    public List<Integer> amados() {
        List<Integer> l = new ArrayList<>();
        for (int indice : interacoes.keySet()) {
            if (interacoes.get(indice)) {
                l.add(indice);
            }
        }
        Collections.sort(l);
        return l;
    }

    public List<Integer> odiados() {
        List<Integer> l = new ArrayList<>();
        for (int indice : interacoes.keySet()) {
            if (!interacoes.get(indice)) {
                l.add(indice);
            }
        }
        Collections.sort(l);
        return l;
    }
}
