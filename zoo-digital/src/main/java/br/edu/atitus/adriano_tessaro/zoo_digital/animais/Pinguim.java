package br.edu.atitus.adriano_tessaro.zoo_digital.animais;
import br.edu.atitus.adriano_tessaro.zoo_digital.comportamentos.*;
import br.edu.atitus.adriano_tessaro.zoo_digital.especies.Ave;
public class Pinguim extends Ave implements Nado, Corrida, Predacao {
    public Pinguim(String nome, int idade) { super(nome, idade); }
    @Override
    public void emitirSom() { System.out.println(getNome() + " faz: Uaaak uaaak!"); }
    @Override
    public void comer()     { System.out.println(getNome() + " está engolindo peixes frescos do Ártico."); }
    @Override
    public void nadar()     { System.out.println(getNome() + " está mergulhando com agilidade em águas geladas."); }
    @Override
    public void correr()    { System.out.println(getNome() + " está caminhando rapidamente sobre o gelo."); }
    @Override
    public void cacar()     { System.out.println(getNome() + " está caçando krill no gelo."); }
}
