package br.edu.atitus.adriano_tessaro.zoo_digital.especies;

public abstract class Ave extends Animal {
    public Ave(String nome, int idade) { super(nome, idade); }

    @Override
    public void comer() {
        System.out.println(getNome() + " (ave) está bicando o alimento.");
    }
}
