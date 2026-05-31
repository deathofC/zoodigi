package br.edu.atitus.adriano_tessaro.zoo_digital.animais;
import br.edu.atitus.adriano_tessaro.zoo_digital.comportamentos.*;
import br.edu.atitus.adriano_tessaro.zoo_digital.especies.Mamifero;
public class Golfinho extends Mamifero implements Nado, Predacao {
    public Golfinho(String nome, int idade) { super(nome, idade); }
    @Override

    public void emitirSom() { System.out.println(getNome() + " faz: Eeeek eeeek! (cliques ultrassônicos)"); }
    @Override

    public void comer()     { System.out.println(getNome() + " está engolindo peixes inteiros."); }
    @Override

    public void nadar()     { System.out.println(getNome() + " está nadando em alta velocidade e fazendo acrobacias."); }
    @Override

    public void cacar()     { System.out.println(getNome() + " está caçando peixes em grupo com sua família."); }
}
