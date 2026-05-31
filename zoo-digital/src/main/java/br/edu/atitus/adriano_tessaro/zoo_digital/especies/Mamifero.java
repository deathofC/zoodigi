package br.edu.atitus.adriano_tessaro.zoo_digital.especies;

public abstract class Mamifero extends Animal {
    public Mamifero(String nome, int idade) { super(nome, idade); }

    @Override
    public void comer() {
        System.out.println(getNome() + " (mamífero) está se alimentando.");
    }
}
