package com.aluno.currencyconverter;

public class CurrencyConverter {
  public static void convert(double amount, String from, String to) {
    try {
      ExchangeRateApiClient client = new ExchangeRateApiClient();
      double rate = client.getRatePair(from, to);
      double result = amount * rate;
      System.out.printf("%.2f %s = %.2f %s (taxa: %.4f)\n", amount, from, result, to, rate);
    } catch (Exception e) {
      System.out.println("Erro ao converter moeda: " + e.getMessage());
    }
  }
}
