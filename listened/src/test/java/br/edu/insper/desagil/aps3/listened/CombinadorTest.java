package br.edu.insper.desagil.aps3.listened;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CombinadorTest {
    private static final double DELTA = 0.000001;

    private Perfil perfilA;
    private Perfil perfilB;
    private Combinador c;

    @BeforeEach
    void setUp() {
        perfilA = criaPerfil("123");
        perfilB = criaPerfil("456");

        List<Perfil> perfis = new ArrayList<>();
        perfis.add(perfilA);
        perfis.add(perfilB);

        c = new Combinador(perfis);
    }

    @Test
    void perfis() {
        assertSame(perfilA, c.perfil("123"));
        assertSame(perfilB, c.perfil("456"));
        assertNull(c.perfil("789"));
    }

    @Test
    void apenasPrimeiro() {
        perfilA.ama(criaVideo(123));
        assertEquals(0.0, c.nota("123", "456"), DELTA);
    }

    @Test
    void apenasSegundo() {
        perfilB.ama(criaVideo(123));
        assertEquals(0.0, c.nota("123", "456"), DELTA);
    }

    @Test
    void igual() {
        perfilA.ama(criaVideo(123));
        perfilB.ama(criaVideo(123));
        assertEquals(1.0, c.nota("123", "456"), DELTA);
    }

    @Test
    void disjunto() {
        perfilA.ama(criaVideo(123));
        perfilB.ama(criaVideo(456));
        assertEquals(0.0, c.nota("123", "456"), DELTA);
    }

    @Test
    void parcial() {
        Video video = criaVideo(123);
        perfilA.ama(video);
        perfilA.ama(criaVideo(456));
        perfilB.ama(video);
        perfilB.ama(criaVideo(789));
        assertEquals(0.333333, c.nota("123", "456"), DELTA);
    }

    private Perfil criaPerfil(String chave) {
        return new Perfil(new Pessoa(chave, "Zé das Couves", 18));
    }

    private Video criaVideo(int indice) {
        return new Video(indice, 600);
    }
}
