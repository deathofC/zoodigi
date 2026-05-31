package br.edu.atitus.adriano_tessaro.zoo_digital.animais;
import br.edu.atitus.adriano_tessaro.zoo_digital.comportamentos.*;
import br.edu.atitus.adriano_tessaro.zoo_digital.especies.Peixe;
public class Salmao extends Peixe implements Nado {
    public Salmao(String nome, int idade) { super(nome, idade); }
    @Override

    public void emitirSom() { System.out.println(getNome() + " emite: Vibrações laterais para se comunicar."); }
    @Override

    public void comer()     { System.out.println(getNome() + " está capturando insetos na superfície da água."); }
    @Override

    public void nadar()     { System.out.println(getNome() + " está nadando contra a correnteza para desovar."); }
}
