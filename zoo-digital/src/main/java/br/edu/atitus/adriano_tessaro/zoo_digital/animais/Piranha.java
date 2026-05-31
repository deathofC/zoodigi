package br.edu.atitus.adriano_tessaro.zoo_digital.animais;
import br.edu.atitus.adriano_tessaro.zoo_digital.comportamentos.*;
import br.edu.atitus.adriano_tessaro.zoo_digital.especies.Peixe;
public class Piranha extends Peixe implements Nado, Predacao {
    public Piranha(String nome, int idade) { super(nome, idade); }
    @Override

    public void emitirSom() { System.out.println(getNome() + " emite: Crocitadas subaquáticas de comunicação."); }
    @Override

    public void comer()     { System.out.println(getNome() + " está devorando em bando com dentição afiada."); }
    @Override

    public void nadar()     { System.out.println(getNome() + " está nadando em cardume pelo Rio Amazonas."); }
    @Override

    public void cacar()     { System.out.println(getNome() + " está caçando em grupo, circundando a presa."); }
}
