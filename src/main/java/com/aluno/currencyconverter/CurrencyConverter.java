/**
 * Author: Sebastian Rodrigues
 * Date: July 2025
* Description: This class is the currency converter that uses the ExchangeRateApiClient to convert between different currencies.
*/
package com.aluno.currencyconverter;

public class CurrencyConverter {
  /**
   * Converts the specified amount from one currency to another
   * using the ExchangeRateApiClient.
   * It fetches the conversion rate from the ExchangeRateApiClient
   * and prints the result.
   * 
   * @param amount The amount of money to convert.
   * @param from   The currency to convert from (e.g., "USD").
   * @param to     The currency to convert to (e.g., "EUR").
   */
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
