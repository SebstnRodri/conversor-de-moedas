package com.aluno.currencyconverter;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int choice = 0;
    System.out.println("""

        ***********************************************
          Seja Bem vindo(a) ao Conversor de Moedas!
        ***********************************************
            """);

    while (choice != 7) {
      showMenu();
      System.out.print("Digite o número que corresponde à opção: ");
      choice = scanner.nextInt();
      switch (choice) {
        case 1:
          System.out.println("Você escolheu: Dólar ==> Peso Argentino");
          System.out.print("Digite o valor em Dólar: ");
          double amount = scanner.nextDouble();
          CurrencyConverter.convert(amount);
          break;
        case 2:
          System.out.println("Você escolheu: Peso Argentino ==> Dólar");
          // Adicione a lógica para esta conversão aqui
          break;
        case 3:
          System.out.println("Você escolheu: Dólar ==> Real");
          // Adicione a lógica para esta conversão aqui
          break;
        case 4:
          System.out.println("Você escolheu: Real ==> Dólar");
          // Adicione a lógica para esta conversão aqui
          break;
        case 5:
          System.out.println("Você escolheu: Dólar ==> Euro");
          // Adicione a lógica para esta conversão aqui
          break;
        case 6:
          System.out.println("Você escolheu: Euro ==> Dólar");
          // Adicione a lógica para esta conversão aqui
          break;
        case 7:
          System.out.println("Saindo do programa. Até mais!");
          break;
        default:
          System.out.println("Opção inválida. Por favor, escolha uma opção de 1 a 7.");
          break;
      }
      // Check if the user wants to continue calculating, unless they explicitly chose
      // to exit
      if (choice != 7) {
        System.out.println("\n"); // Add a newline before asking to continue
        System.out.print("Deseja continuar convertendo? (s/n): ");
        String continueInput = scanner.next();
        if (!continueInput.equalsIgnoreCase("s")) {
          System.out.println("Saindo do programa. Até mais!");
          choice = 7; // Set choice to 7 to exit the main loop gracefully
        }
      }
    }
    scanner.close();
  }

  public static void showMenu() {
    String menu = """
        ---------------------------------------
            Escolha uma das opções abaixo!

            1) Dólar ==> Peso Argentino
            2) Peso Argentino ==> Dólar
            3) Dólar ==> Real
            4) Real ==> Dólar
            5) Dólar ==> Euro
            6) Euro ==> Dólar
            7) Sair
        ---------------------------------------
                    """;
    System.out.println(menu);
  }
}
