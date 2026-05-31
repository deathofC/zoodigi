package br.edu.atitus.adriano_tessaro.zoo_digital.animais;
import br.edu.atitus.adriano_tessaro.zoo_digital.comportamentos.*;
import br.edu.atitus.adriano_tessaro.zoo_digital.especies.Mamifero;
public class Leao extends Mamifero implements Corrida, Predacao {
    public Leao(String nome, int idade) { super(nome, idade); }
    @Override

    public void emitirSom() { System.out.println(getNome() + " faz: ROOOAAR!"); }
    @Override

    public void comer()     { System.out.println(getNome() + " está devorando sua presa na savana."); }
    @Override

    public void correr()    { System.out.println(getNome() + " está correndo em velocidade máxima na savana."); }
    @Override

    public void cacar()     { System.out.println(getNome() + " está caçando em emboscada, rastejando na grama alta."); }
}
