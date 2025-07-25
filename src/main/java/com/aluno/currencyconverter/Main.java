/**
 * Author: Sebastian Rodrigues
 * Date: July 2025
 * Description: This class is the main entry point for the Currency Converter application.
 * It provides a menu-driven interface for users to convert between various currencies, including USD, ARS, BRL, and EUR.
 */
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
      try {
        choice = readIntInput(scanner, "Digite o número que corresponde à opção: ");
        if (choice < 1 || choice > 7) {
          throw new IllegalArgumentException("Opção inválida. Por favor, escolha uma opção de 1 a 7.");
        }
        switch (choice) {
          case 1:
            System.out.print("Você escolheu: Dólar ==> Peso Argentino\n");
            double amount = readDoubleInput(scanner, "Digite o valor em Dólar: ");
            CurrencyConverter.convert(amount, "USD", "ARS");
            break;
          case 2:
            System.out.print("Você escolheu: Peso Argentino ==> Dólar\n");
            amount = readDoubleInput(scanner, "Digite o valor em Peso Argentino: ");
            CurrencyConverter.convert(amount, "ARS", "USD");
            break;
          case 3:
            System.out.print("Você escolheu: Dólar ==> Real\n");
            amount = readDoubleInput(scanner, "Digite o valor em Dólar: ");
            CurrencyConverter.convert(amount, "USD", "BRL");
            break;
          case 4:
            System.out.print("Você escolheu: Real ==> Dólar\n");
            amount = readDoubleInput(scanner, "Digite o valor em Real: ");
            CurrencyConverter.convert(amount, "BRL", "USD");
            break;
          case 5:
            System.out.print("Você escolheu: Dólar ==> Euro\n");
            amount = readDoubleInput(scanner, "Digite o valor em Dólar: ");
            CurrencyConverter.convert(amount, "USD", "EUR");
            break;
          case 6:
            System.out.print("Você escolheu: Euro ==> Dólar\n");
            amount = readDoubleInput(scanner, "Digite o valor em Euro: ");
            CurrencyConverter.convert(amount, "EUR", "USD");
            break;
          case 7:
            System.out.println("Saindo do programa. Até mais!");
            break;
        }
      } catch (IllegalArgumentException e) {
        System.out.println("Erro: " + e.getMessage());
      } catch (Exception e) {
        System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
      }

      if (choice != 7) {
        System.out.println("\n");
        System.out.print("Deseja continuar convertendo? (s/n): ");
        String continueInput = scanner.nextLine();
        if (!continueInput.equalsIgnoreCase("s")) {
          System.out.println("Saindo do programa. Até mais!");
          choice = 7;
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

  /**
   * Lê uma entrada inteira do usuário, tratando erros de entrada não numérica.
   *
   * @param scanner O objeto Scanner para ler a entrada.
   * @param prompt  A mensagem a ser exibida ao usuário.
   * @return O inteiro válido digitado pelo usuário.
   */
  private static int readIntInput(Scanner scanner, String prompt) {
    while (true) {
      System.out.print(prompt);
      String input = scanner.nextLine();
      try {
        return Integer.parseInt(input);
      } catch (NumberFormatException e) {
        System.out.println("Entrada inválida. Por favor, digite um número inteiro válido.");
      }
    }
  }

  /**
   * Lê uma entrada double do usuário, tratando erros de entrada não numérica.
   *
   * @param scanner O objeto Scanner para ler a entrada.
   * @param prompt  A mensagem a ser exibida ao usuário.
   * @return O double válido digitado pelo usuário.
   */
  private static double readDoubleInput(Scanner scanner, String prompt) {
    while (true) {
      System.out.print(prompt);
      String input = scanner.nextLine();
      try {
        return Double.parseDouble(input);
      } catch (NumberFormatException e) {
        System.out.println("Entrada inválida. Por favor, digite um valor numérico válido.");
      }
    }
  }
}
