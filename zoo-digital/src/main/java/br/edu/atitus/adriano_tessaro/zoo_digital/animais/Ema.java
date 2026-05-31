package br.edu.atitus.adriano_tessaro.zoo_digital.animais;
import br.edu.atitus.adriano_tessaro.zoo_digital.comportamentos.*;
import br.edu.atitus.adriano_tessaro.zoo_digital.especies.Ave;
public class Ema extends Ave implements Corrida {
    public Ema(String nome, int idade) { super(nome, idade); }
    @Override

    public void emitirSom() { System.out.println(getNome() + " faz: Bum bum bum! (sons graves de tambor)"); }
    @Override

    public void comer()     { System.out.println(getNome() + " está comendo frutas, sementes e insetos."); }
    @Override

    public void correr()    { System.out.println(getNome() + " está correndo a mais de 50 km/h pelo cerrado."); }
}
