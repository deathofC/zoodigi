package br.edu.atitus.adriano_tessaro.zoo_digital.animais;
import br.edu.atitus.adriano_tessaro.zoo_digital.comportamentos.*;
import br.edu.atitus.adriano_tessaro.zoo_digital.especies.Reptil;
public class Cobra extends Reptil implements Predacao {
    public Cobra(String nome, int idade) { super(nome, idade); }
    @Override public void emitirSom() { System.out.println(getNome() + " faz: Ssssssss!"); }
    @Override public void comer()     { System.out.println(getNome() + " está engolindo a presa inteira, começando pela cabeça."); }
    @Override public void cacar()     { System.out.println(getNome() + " está caçando, usando a língua bifurcada para rastrear a presa."); }
}
