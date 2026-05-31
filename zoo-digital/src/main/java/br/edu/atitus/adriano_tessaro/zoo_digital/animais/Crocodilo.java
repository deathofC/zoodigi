package br.edu.atitus.adriano_tessaro.zoo_digital.animais;
import br.edu.atitus.adriano_tessaro.zoo_digital.comportamentos.*;
import br.edu.atitus.adriano_tessaro.zoo_digital.especies.Reptil;
public class Crocodilo extends Reptil implements Nado, Corrida, Predacao {
    public Crocodilo(String nome, int idade) { super(nome, idade); }
    @Override
    public void emitirSom() { System.out.println(getNome() + " faz: HSSSSSS (sibilo ameaçador)!"); }

    @Override
    public void comer()     { System.out.println(getNome() + " está realizando o 'death roll' para desmembrar a presa."); }
    @Override
    public void nadar()     { System.out.println(getNome() + " está nadando com apenas os olhos visíveis."); }
    @Override
    public void correr()    { System.out.println(getNome() + " está galopando em alta velocidade para emboscar a presa."); }
    @Override
    public void cacar()     { System.out.println(getNome() + " está caçando, imóvel à beira d'água esperando o momento certo."); }
}
