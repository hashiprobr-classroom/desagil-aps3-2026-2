package br.edu.insper.desagil.aps3.listened;

public class Pessoa {
    private String chave;
    private String nome;
    private int idade;

    public Pessoa(String chave, String nome, int idade) {
        this.chave = chave;
        this.nome = nome;
        this.idade = idade;
    }

    public String getChave() {
        return chave;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void menos() {
        idade--;
    }

    public void mais() {
        idade++;
    }
}
