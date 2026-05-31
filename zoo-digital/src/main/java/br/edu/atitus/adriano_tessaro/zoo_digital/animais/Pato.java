package br.edu.atitus.adriano_tessaro.zoo_digital.animais;
import br.edu.atitus.adriano_tessaro.zoo_digital.comportamentos.*;
import br.edu.atitus.adriano_tessaro.zoo_digital.especies.Ave;
public class Pato extends Ave implements Voo, Nado, Corrida {
    public Pato(String nome, int idade) { super(nome, idade); }
    @Override

    public void emitirSom() { System.out.println(getNome() + " faz: Quack quack!"); }
    @Override

    public void comer()     { System.out.println(getNome() + " está filtrando a água com o bico."); }
    @Override

    public void voar()      { System.out.println(getNome() + " está voando em formação com outros patos."); }
    @Override

    public void nadar()     { System.out.println(getNome() + " está nadando tranquilamente no lago."); }
    @Override

    public void correr()    { System.out.println(getNome() + " está correndo bamboleando em direção à água."); }
}
