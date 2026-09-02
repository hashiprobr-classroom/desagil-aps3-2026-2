package br.edu.insper.desagil.aps3.listened;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VideoTest {
    private static final int INDICE = 123;

    private Video v;

    @Test
    void duracao5() {
        v = new Video(INDICE, 5);
        assertEquals("[sem título] (0:05)", v.identificacao());
    }

    @Test
    void duracao25() {
        v = new Video(INDICE, 25);
        assertEquals("[sem título] (0:25)", v.identificacao());
    }

    @Test
    void duracao65() {
        v = new Video(INDICE, 65);
        assertEquals("[sem título] (1:05)", v.identificacao());
    }

    @Test
    void duracao85() {
        v = new Video(INDICE, 85);
        assertEquals("[sem título] (1:25)", v.identificacao());
    }

    @Test
    void titulo() {
        v = new Video(INDICE, 600);
        v.setTitulo("Algum Título");
        assertEquals("Algum Título (10:00)", v.identificacao());
    }
}
