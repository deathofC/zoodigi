package br.edu.atitus.adriano_tessaro.zoo_digital.animais;
import br.edu.atitus.adriano_tessaro.zoo_digital.comportamentos.*;
import br.edu.atitus.adriano_tessaro.zoo_digital.especies.Mamifero;
public class Cachorro extends Mamifero implements Corrida, Nado, Predacao {
    public Cachorro(String nome, int idade) { super(nome, idade); }
    @Override

    public void emitirSom() { System.out.println(getNome() + " faz: Au au!"); }
    @Override

    public void comer()     { System.out.println(getNome() + " está roendo um osso."); }
    @Override

    public void correr()    { System.out.println(getNome() + " está correndo animado pelo parque."); }
    @Override

    public void nadar()     { System.out.println(getNome() + " está nadando e resgatando objetos na água."); }
    @Override

    public void cacar()     { System.out.println(getNome() + " está caçando a meia que roubou."); }
}
