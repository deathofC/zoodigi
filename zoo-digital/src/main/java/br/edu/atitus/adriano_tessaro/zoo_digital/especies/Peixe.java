package br.edu.atitus.adriano_tessaro.zoo_digital.especies;

public abstract class Peixe extends Animal {
    public Peixe(String nome, int idade) { super(nome, idade); }

    @Override
    public void comer() {
        System.out.println(getNome() + " (peixe) está engolindo o alimento na água.");
    }
}
