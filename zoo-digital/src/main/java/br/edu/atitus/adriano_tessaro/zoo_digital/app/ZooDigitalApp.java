package br.edu.atitus.adriano_tessaro.zoo_digital.app;

import br.edu.atitus.adriano_tessaro.zoo_digital.animais.*;
import br.edu.atitus.adriano_tessaro.zoo_digital.comportamentos.*;
import br.edu.atitus.adriano_tessaro.zoo_digital.especies.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZooDigitalApp {

    // lista persistente durante toda a execução armazena como animal (upcasting)
    private static final List<Animal> animais = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("       BEM-VINDO AO ZOO(zologico) DIGITAL v1.0        ");
        System.out.println("==============================================");

        int opcao = -1;
        while (opcao != 0) {
            exibirMenu();
            opcao = lerInteiro("Escolha uma opção: ");
            System.out.println();

            switch (opcao) {
                case 1 -> cadastrarAnimal();
                case 2 -> listarTodos();
                case 3 -> listarCorredores();
                case 4 -> listarNadadores();
                case 5 -> listarVoadores();
                case 6 -> listarPredadores();
                case 7 -> exibirTotal();
                case 0 -> System.out.println("Até logo! O Zoo Digital encerra aqui.");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
            System.out.println();
        }

        scanner.close();
    }

    // ──────────────────────────────────────────────────────────────────
    // MENU
    // ──────────────────────────────────────────────────────────────────
    private static void exibirMenu() {
        System.out.println("----------------------------------------------");
        System.out.println("               MENU PRINCIPAL                 ");
        System.out.println("----------------------------------------------");
        System.out.println(" 1 - Cadastrar Animal");
        System.out.println(" 2 - Listar Todos os Animais");
        System.out.println(" 3 - Listar Animais Corredores");
        System.out.println(" 4 - Listar Animais Nadadores");
        System.out.println(" 5 - Listar Animais Voadores");
        System.out.println(" 6 - Listar Animais Predadores");
        System.out.println(" 7 - Exibir Total de Animais Cadastrados");
        System.out.println(" 0 - Sair");
        System.out.println("----------------------------------------------");
    }

    // ──────────────────────────────────────────────────────────────────
    // OPÇÃO 1 — CADASTRAR ANIMAL
    // ──────────────────────────────────────────────────────────────────
    private static void cadastrarAnimal() {
        System.out.println("=== CADASTRAR ANIMAL ===");
        System.out.println("Tipos disponíveis:");
        System.out.println("--- Mamíferos ---");
        System.out.println("  1-Cachorro  2-Gato  3-Golfinho  4-Leao  5-Morcego");
        System.out.println("--- Aves ---");
        System.out.println("  6-Pato  7-Pinguim  8-Aguia  9-Ema");
        System.out.println("--- Peixes ---");
        System.out.println("  10-PeixeMorcego  11-Traira  12-Piranha  13-Salmao");
        System.out.println("--- Répteis ---");
        System.out.println("  14-Crocodilo  15-Cobra  16-Iguana  17-Tartaruga");

        int tipo = lerInteiro("Digite o número do tipo: ");
        if (tipo < 1 || tipo > 17) {
            System.out.println("Tipo inválido!");
            return;
        }

        System.out.print("Nome do animal: ");
        String nome = scanner.nextLine().trim();
        if (nome.isEmpty()) {
            System.out.println("Nome não pode ser vazio!");
            return;
        }

        int idade = lerInteiro("Idade (anos): ");
        if (idade < 0) {
            System.out.println("Idade não pode ser negativa!");
            return;
        }

        // Instanciar+ Upcasting implícito para Animal
        Animal animal = switch (tipo) {
            case  1 -> new Cachorro(nome, idade);
            case  2 -> new Gato(nome, idade);
            case  3 -> new Golfinho(nome, idade);
            case  4 -> new Leao(nome, idade);
            case  5 -> new Morcego(nome, idade);
            case  6 -> new Pato(nome, idade);
            case  7 -> new Pinguim(nome, idade);
            case  8 -> new Aguia(nome, idade);
            case  9 -> new Ema(nome, idade);
            case 10 -> new PeixeMorcego(nome, idade);
            case 11 -> new Traira(nome, idade);
            case 12 -> new Piranha(nome, idade);
            case 13 -> new Salmao(nome, idade);
            case 14 -> new Crocodilo(nome, idade);
            case 15 -> new Cobra(nome, idade);
            case 16 -> new Iguana(nome, idade);
            case 17 -> new Tartaruga(nome, idade);
            default -> null;
        };

        animais.add(animal);   //objeto concreto armazenado como Animal
        System.out.println("✔ Animal cadastrado com sucesso: " + animal);
    }

    // OPÇÃO 2 — LISTAR TODOS (Polimorfismo)
    private static void listarTodos() {
        System.out.println("=== LISTA DE TODOS OS ANIMAIS ===");
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado ainda.");
            return;
        }
        for (Animal a : animais) {
            System.out.println("\n" + a);
            a.emitirSom();
            a.comer();
        }
    }

    // OPÇÃO 3 — CORREDORES (instanceof + Downcasting)
    private static void listarCorredores() {
        System.out.println("=== ANIMAIS CORREDORES ===");
        boolean encontrou = false;
        for (Animal a : animais) {
            if (a instanceof Corrida corredor) {
                System.out.println("\n" + a);
                corredor.correr();
                encontrou = true;
            }
        }
        if (!encontrou) System.out.println("Nenhum animal corredor cadastrado.");
    }

    // ──────────────────────────────────────────────────────────────────
    // OPÇÃO 4 — NADADORES
    // ──────────────────────────────────────────────────────────────────
    private static void listarNadadores() {
        System.out.println("=== ANIMAIS NADADORES ===");
        boolean encontrou = false;
        for (Animal a : animais) {
            if (a instanceof Nado nadador) {
                System.out.println("\n" + a);
                nadador.nadar();
                encontrou = true;
            }
        }
        if (!encontrou) System.out.println("Nenhum animal nadador cadastrado.");
    }

    // OPÇÃO 5 — VOADORES
    private static void listarVoadores() {
        System.out.println("=== ANIMAIS VOADORES ===");
        boolean encontrou = false;
        for (Animal a : animais) {
            if (a instanceof Voo voador) {
                System.out.println("\n" + a);
                voador.voar();
                encontrou = true;
            }
        }
        if (!encontrou) System.out.println("Nenhum animal voador cadastrado.");
    }


    // OPÇÃO 6 — PREDADORES
    private static void listarPredadores() {
        System.out.println("=== ANIMAIS PREDADORES ===");
        boolean encontrou = false;
        for (Animal a : animais) {
            if (a instanceof Predacao predador) {
                System.out.println("\n" + a);
                predador.cacar();
                encontrou = true;
            }
        }
        if (!encontrou) System.out.println("Nenhum animal predador cadastrado.");
    }

    // OPÇÃO 7 — TOTAL static
    private static void exibirTotal() {
        System.out.println("=== TOTAL DE ANIMAIS CADASTRADOS ===");
        System.out.println("Total: " + Animal.getContador() + " animais ou animal.");
    }

    // UTILIDADE — leitura segura de inteiro
    private static int lerInteiro(String prompt) {
        while (true) {
            System.out.print(prompt);
            String linha = scanner.nextLine();
            try {
                return Integer.parseInt(linha.trim());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um número inteiro.");
            }
        }
    }
}
