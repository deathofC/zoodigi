package br.edu.atitus.adriano_tessaro.zoo_digital.animais;
import br.edu.atitus.adriano_tessaro.zoo_digital.comportamentos.*;
import br.edu.atitus.adriano_tessaro.zoo_digital.especies.Peixe;
public class Traira extends Peixe implements Nado, Predacao {
    public Traira(String nome, int idade) { super(nome, idade); }
    @Override

    public void emitirSom() { System.out.println(getNome() + " emite: Grunhidos subaquáticos ao se agitar."); }
    @Override

    public void comer()     { System.out.println(getNome() + " está mordendo com força a isca do pescador."); }
    @Override

    public void nadar()     { System.out.println(getNome() + " está nadando velozmente entre as raízes subaquáticas."); }
    @Override

    public void cacar()     { System.out.println(getNome() + " está caçando outros peixes com sua mordida poderosa."); }
}
