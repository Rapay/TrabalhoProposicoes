package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------------------------------------");
        System.out.println("Olá, seja bem-vindo ao calculador de proposições lógicas\n");

        while (true) {
            System.out.print("Digite se a primeira proposição será verdadeira ou falsa: ");
            boolean p1 = getBooleanFromInput(scanner);

            System.out.print("Digite se a segunda proposição será verdadeira ou falsa: ");
            boolean p2 = getBooleanFromInput(scanner);

            // Menu para facilitar o entendimento do usuario
            System.out.println("\nEscolha o conectivo lógico:");
            System.out.println("1 - Conjunção (E)");
            System.out.println("2 - Disjunção (OU)");
            System.out.println("3 - Condicional (->)");
            System.out.println("0 - Sair");
            int opcao = scanner.nextInt();

            if (opcao == 0) {
                System.out.println("Obrigado por utilizar o calculador de proposições logicas <3 ");
                break;
            }

            boolean resultado = false;
            switch (opcao) {
                case 1:
                    resultado = p1 && p2; // Conjunção (E)
                    break;
                case 2:
                    resultado = p1 || p2; // Disjunção (OU)
                    break;
                case 3:
                    resultado = !p1 || p2; // Condicional (->)
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    continue;
            }

            // Exibe o resultado 
            String ExibirResultado = resultado ? "verdadeiro" : "falso";
            System.out.println("O valor lógico resultante é: " + ExibirResultado + "\n");
            System.out.println("Obrigado por utilizar o calculador de proposições logicas <3\n");
            System.out.println("Caso queira utiliza-lo novamente siga as instruções apresentadas a seguir:\n");
        }

        scanner.close();
    }

    private static boolean getBooleanFromInput(Scanner scanner) {
        String input = scanner.next().toLowerCase();
        while (!input.equals("verdadeira") && !input.equals("falsa")) {
            System.out.print("Valor inválido, por favor digite (verdadeira) ou (falsa): ");
            input = scanner.next().toLowerCase();
        }
        return input.equals("verdadeira");
    }
}
