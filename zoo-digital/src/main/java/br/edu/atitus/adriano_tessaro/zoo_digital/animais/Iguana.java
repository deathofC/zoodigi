package br.edu.atitus.adriano_tessaro.zoo_digital.animais;
import br.edu.atitus.adriano_tessaro.zoo_digital.comportamentos.*;
import br.edu.atitus.adriano_tessaro.zoo_digital.especies.Reptil;
public class Iguana extends Reptil implements Corrida {
    public Iguana(String nome, int idade) { super(nome, idade); }
    @Override

    public void emitirSom() { System.out.println(getNome() + " faz: Hss! (sopro de alerta)."); }
    @Override

    public void comer()     { System.out.println(getNome() + " está mastigando folhas e flores."); }
    @Override

    public void correr()    { System.out.println(getNome() + " está correndo rapidamente sobre duas patas para escapar."); }
}
