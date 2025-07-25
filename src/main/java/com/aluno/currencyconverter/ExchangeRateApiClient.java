package com.aluno.currencyconverter;

import java.io.InputStreamReader;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ExchangeRateApiClient {
  private static final String API_KEY = "a1b0e2940a54a5775a5161a2";
  private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";

  public JsonObject getRates(String baseCurrency) throws Exception {
    String urlStr = BASE_URL + API_KEY + "/latest/" + baseCurrency;
    URL url = URI.create(urlStr).toURL();
    HttpURLConnection request = (HttpURLConnection) url.openConnection();
    request.connect();

    JsonElement root = JsonParser.parseReader(new InputStreamReader((InputStream) request.getContent()));
    return root.getAsJsonObject();
  }

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
