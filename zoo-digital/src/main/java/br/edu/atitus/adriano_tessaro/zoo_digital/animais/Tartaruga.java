package br.edu.atitus.adriano_tessaro.zoo_digital.animais;
import br.edu.atitus.adriano_tessaro.zoo_digital.comportamentos.*;
import br.edu.atitus.adriano_tessaro.zoo_digital.especies.Reptil;
public class Tartaruga extends Reptil implements Nado {
    public Tartaruga(String nome, int idade) { super(nome, idade); }
    @Override

    public void emitirSom() { System.out.println(getNome() + " faz: Guuu!"); }
    @Override

    public void comer()     { System.out.println(getNome() + " está comendo algas marinhas tranquilamente."); }
    @Override

    public void nadar()     { System.out.println(getNome() + " está nadando graciosamente com suas nadadeiras."); }
}
