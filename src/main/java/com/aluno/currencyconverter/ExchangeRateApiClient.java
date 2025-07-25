/**
 * Author: Sebastian Rodrigues
 * Date: July 2025
 * Description: This class provides methods to interact with the ExchangeRate-API to fetch currency conversion rates.
 */
package com.aluno.currencyconverter;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ExchangeRateApiClient {
  private static final String API_KEY;
  private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";

  static {
    API_KEY = System.getenv("EXCHANGE_RATE_API_KEY");
    // Ensure the API key is set correctly
    if (API_KEY == null || API_KEY.isEmpty()) {
      throw new IllegalArgumentException(
          "A variável de ambiente EXCHANGE_RATE_API_KEY não está definida ou está vazia.");
    }
  }

  /**
   * Get the conversion rate between two currencies.
   *
   * @param from The currency to convert from (e.g., "USD").
   * @param to   The currency to convert to (e.g., "EUR").
   * @return The conversion rate as a double.
   */
  public double getRatePair(String from, String to) throws Exception {
    String urlStr = BASE_URL + API_KEY + "/pair/" + from + "/" + to;
    URL url = URI.create(urlStr).toURL();
    HttpURLConnection request = (HttpURLConnection) url.openConnection();
    request.connect();

    JsonElement root = JsonParser.parseReader(new InputStreamReader((InputStream) request.getContent()));
    JsonObject jsonobj = root.getAsJsonObject();
    if (!"success".equals(jsonobj.get("result").getAsString())) {
      throw new RuntimeException("Erro na consulta da taxa: " + jsonobj.get("error-type").getAsString());
    }
    return jsonobj.get("conversion_rate").getAsDouble();
  }
}
