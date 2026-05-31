package br.edu.atitus.adriano_tessaro.zoo_digital.animais;
import br.edu.atitus.adriano_tessaro.zoo_digital.comportamentos.*;
import br.edu.atitus.adriano_tessaro.zoo_digital.especies.Mamifero;
public class Gato extends Mamifero implements Corrida, Predacao {
    public Gato(String nome, int idade) { super(nome, idade); }
    @Override public void emitirSom() { System.out.println(getNome() + " faz: Miau!"); }

    @Override
    public void comer()     { System.out.println(getNome() + " está lambendo as patinhas após comer."); }
    @Override
    public void correr()    { System.out.println(getNome() + " está correndo atrás de um novelo de lã."); }
    @Override
    public void cacar()     { System.out.println(getNome() + " está caçando um rato silenciosamente."); }
}
