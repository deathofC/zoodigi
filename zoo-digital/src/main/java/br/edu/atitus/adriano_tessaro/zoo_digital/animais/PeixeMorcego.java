package br.edu.atitus.adriano_tessaro.zoo_digital.animais;
import br.edu.atitus.adriano_tessaro.zoo_digital.comportamentos.*;
import br.edu.atitus.adriano_tessaro.zoo_digital.especies.Peixe;
public class PeixeMorcego extends Peixe implements Nado {
    public PeixeMorcego(String nome, int idade) { super(nome, idade); }
    @Override

    public void emitirSom() { System.out.println(getNome() + " emite: Pulsos elétricos subaquáticos."); }
    @Override

    public void comer()     { System.out.println(getNome() + " está atraindo presas com sua isca bioluminescente."); }
    @Override

    public void nadar()     { System.out.println(getNome() + " está caminhando pelo fundo com nadadeiras modificadas."); }
}
