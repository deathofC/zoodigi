package br.edu.atitus.adriano_tessaro.zoo_digital.especies;

public abstract class Reptil extends Animal {
    public Reptil(String nome, int idade) { super(nome, idade); }

    @Override
    public void comer() {
        System.out.println(getNome() + " (réptil) está devorando lentamente sua presa.");
    }
}
