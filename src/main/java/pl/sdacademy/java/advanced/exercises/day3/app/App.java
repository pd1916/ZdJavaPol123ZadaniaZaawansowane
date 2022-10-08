package pl.sdacademy.java.advanced.exercises.day3.app;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class App {
    /*
    logika dla usera:
    1. podaj currency np EUR
    2. podaj ilość pieniędzy na wymianę - 100 USD ile to PLN, 100 PLN to ile USD
    3. wynik zapisać do pliku, jako plik txt lub jako jakiś obiekt np Result (currency, result)
    4. todo
     */
    public static void main(String[] args) throws MalformedURLException, JsonProcessingException {
        String result = "";
        URL nbp = new URL("http://api.nbp.pl/api/exchangerates/tables/a/?format=json");
        try(BufferedReader br = new BufferedReader(new InputStreamReader(nbp.openConnection().getInputStream()))) {
            String inputLine;
            while((inputLine = br.readLine()) != null) {
                result += inputLine;
            }
        } catch(IOException e) {
            e.printStackTrace();
        }

        ObjectMapper om = new ObjectMapper();
        Root root = om.readValue(result, Root[].class)[0];

        double exchange = root.getRates().stream()
                .filter(rate -> rate.getCode().equalsIgnoreCase("EUR"))
                .mapToDouble(Rate::getMid)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("nie znaleziono przelicznika"));

        System.out.println("Data: " + root.getEffectiveDate());
        System.out.println("Value: " + exchange);
    }
}
