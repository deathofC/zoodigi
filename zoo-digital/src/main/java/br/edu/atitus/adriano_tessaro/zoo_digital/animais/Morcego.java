package br.edu.atitus.adriano_tessaro.zoo_digital.animais;
import br.edu.atitus.adriano_tessaro.zoo_digital.comportamentos.*;
import br.edu.atitus.adriano_tessaro.zoo_digital.especies.Mamifero;
public class Morcego extends Mamifero implements Voo, Predacao {
    public Morcego(String nome, int idade) { super(nome, idade); }
    @Override

    public void emitirSom() { System.out.println(getNome() + " emite: Sons ultrassônicos inaudíveis."); }
    @Override

    public void comer()     { System.out.println(getNome() + " está sugando o néctar de flores."); }
    @Override

    public void voar()      { System.out.println(getNome() + " está voando silenciosamente no escuro."); }
    @Override

    public void cacar()     { System.out.println(getNome() + " está caçando insetos em pleno voo com ecolocalização."); }
}
