package br.edu.atitus.adriano_tessaro.zoo_digital.especies;

import org.apache.commons.lang3.StringUtils;

public abstract class Animal {

    private String nome;
    private int    idade;
    private static int contador = 0;

    public Animal(String nome, int idade) {
        this.nome  = StringUtils.capitalize(nome.trim().toLowerCase());
        this.idade = idade;
        contador++;
    }

    public abstract void emitirSom();

    public void comer() {
        System.out.println(nome + " está comendo.");
    }

    public final void comer(String alimento) {
        System.out.println(nome + " está comendo " + alimento + ".");
    }

    public static int getContador() { return contador; }

    public String getNome()            { return nome; }
    public void   setNome(String nome) { this.nome = StringUtils.capitalize(nome.trim().toLowerCase()); }
    public int    getIdade()           { return idade; }
    public void   setIdade(int idade)  { this.idade = idade; }

    @Override
    public String toString() {
        return String.format("Nome: %-15s | Idade: %2d ano(s) | Espécie: %s",
                nome, idade, getClass().getSimpleName());
    }
}
