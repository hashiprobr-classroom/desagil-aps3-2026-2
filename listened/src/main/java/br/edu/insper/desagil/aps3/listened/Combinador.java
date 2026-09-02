package br.edu.insper.desagil.aps3.listened;

import java.util.List;

public class Combinador {
    private List<Perfil> perfis;

    public Combinador(List<Perfil> perfis) {
        this.perfis = perfis;
    }

    public Perfil perfil(String chave) {
        for (Perfil p : perfis) {
            if (p.getPessoa().getChave().equals(chave)) {
                return p;
            }
        }
        return null;
    }

    public double jaccard(List<Integer> indicesA, List<Integer> indicesB) {
        if (indicesA.isEmpty() || indicesB.isEmpty()) {
            return 0.0;
        }

        int i = 0;
        for (int chave : indicesA) {
            if (indicesB.contains(chave)) {
                i++;
            }
        }

        int u = indicesA.size() + indicesB.size() - i;

        return (double) i / u;
    }

    public double nota(String a, String b) {
        return jaccard(perfil(a).amados(), perfil(b).amados());
    }
}
