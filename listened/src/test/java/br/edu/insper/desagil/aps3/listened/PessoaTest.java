package br.edu.insper.desagil.aps3.listened;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PessoaTest {
    private Pessoa p;

    @BeforeEach
    void setUp() {
        p = new Pessoa("123", "Zé das Couves", 18);
    }

    @Test
    void constroi() {
        assertEquals("123", p.getChave());
        assertEquals("Zé das Couves", p.getNome());
        assertEquals(18, p.getIdade());
    }

    @Test
    void mudaNome() {
        p.setNome("João do Brócolis");
        assertEquals("João do Brócolis", p.getNome());
    }

    @Test
    void menos() {
        p.menos();
        assertEquals(17, p.getIdade());
    }

    @Test
    void mais() {
        p.mais();
        assertEquals(19, p.getIdade());
    }
}
