package br.edu.atitus.adriano_tessaro.zoo_digital.animais;
import br.edu.atitus.adriano_tessaro.zoo_digital.comportamentos.*;
import br.edu.atitus.adriano_tessaro.zoo_digital.especies.Ave;
public class Aguia extends Ave implements Voo, Predacao {
    public Aguia(String nome, int idade) { super(nome, idade); }
    @Override

    public void emitirSom() { System.out.println(getNome() + " faz: Kreeee kreeee!"); }
    @Override

    public void comer()     { System.out.println(getNome() + " está despedaçando a presa com suas garras."); }
    @Override

    public void voar()      { System.out.println(getNome() + " está planando a 3000 metros de altitude."); }
    @Override

    public void cacar()     { System.out.println(getNome() + " está caçando, mergulhando em alta velocidade."); }
}
