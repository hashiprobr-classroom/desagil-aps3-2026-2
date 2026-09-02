package br.edu.insper.desagil.aps3.listened;

import java.util.List;

public class CombinadorPago extends Combinador {
    public CombinadorPago(List<Perfil> perfis) {
        super(perfis);
    }

    @Override
    public double nota(String a, String b) {
        double positiva = super.nota(a, b);
        double negativa = jaccard(perfil(a).odiados(), perfil(b).odiados());
        return (positiva + negativa) / 2;
    }
}
