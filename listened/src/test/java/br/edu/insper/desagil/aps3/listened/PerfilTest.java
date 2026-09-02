package br.edu.insper.desagil.aps3.listened;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PerfilTest {
    private static final int DURACAO = 5;

    private Perfil p;

    @BeforeEach
    void setUp() {
        p = new Perfil(new Pessoa("123", "Zé das Couves", 18));
    }

    @Test
    void constroi() {
        assertEquals(0, p.total());
        assertEquals(List.of(), p.amados());
        assertEquals(List.of(), p.odiados());
    }

    @Test
    void ama() {
        p.ama(new Video(123, DURACAO));
        assertEquals(1, p.total());
        assertEquals(List.of(123), p.amados());
        assertEquals(List.of(), p.odiados());
    }

    @Test
    void amaAma() {
        p.ama(new Video(123, DURACAO));
        p.ama(new Video(456, DURACAO));
        assertEquals(2, p.total());
        assertEquals(List.of(123, 456), p.amados());
        assertEquals(List.of(), p.odiados());
    }

    @Test
    void amaOdeia() {
        p.ama(new Video(123, DURACAO));
        p.odeia(new Video(456, DURACAO));
        assertEquals(2, p.total());
        assertEquals(List.of(123), p.amados());
        assertEquals(List.of(456), p.odiados());
    }

    @Test
    void odeia() {
        p.odeia(new Video(123, DURACAO));
        assertEquals(1, p.total());
        assertEquals(List.of(), p.amados());
        assertEquals(List.of(123), p.odiados());
    }

    @Test
    void odeiaAma() {
        p.odeia(new Video(123, DURACAO));
        p.ama(new Video(456, DURACAO));
        assertEquals(2, p.total());
        assertEquals(List.of(456), p.amados());
        assertEquals(List.of(123), p.odiados());
    }

    @Test
    void odeiaOdeia() {
        p.odeia(new Video(123, DURACAO));
        p.odeia(new Video(456, DURACAO));
        assertEquals(2, p.total());
        assertEquals(List.of(), p.amados());
        assertEquals(List.of(123, 456), p.odiados());
    }
}
