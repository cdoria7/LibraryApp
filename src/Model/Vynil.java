package Model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Vynil implements Product {

  private String id;
  private String author;
  private String title;
  private List<String> optional = new ArrayList<>();

  private int rpm;
  private double price;


  /**
   * Constructors
   */
  public Vynil() {
  }

  public Vynil(String title, String author,  int rpm, double price, List<String> optional) {
    this.id = generateId();
    this.author = author;
    this.title = title;
    this.optional = optional;
    this.rpm = rpm;
    this.price = price;
  }

  @Override
  public String show() {
    if(optional.isEmpty())
     return "Codice: "+ id + "\nTitolo: " +title+ "\nAutore: " +author+ "\nrpm: " +rpm+ "\nPrezzo: " + price;
    else
      return   "Codice: "+ id + "\nTitolo: " +title+ "\nAutore: " +author+ "\nrpm: " +rpm+ "\nPrezzo: " + price + "\nOptional: " + optional.toString();
  }


  @Override
  public List<String> getOptional() {
    return optional;
  }

  @Override
  public String getProductId() {
    return id;
  }

  @Override
  public double getPrice() {
    return price;
  }

  @Override
  public String generateId() {
    return UUID.randomUUID().toString();
  }

  @Override
  public Product createProduct() throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Inserisci il titolo:");
    String title = reader.readLine();

    System.out.println("Inserisci l'autore:");
    String author = reader.readLine();

    System.out.println("Inserisci l'autore:");
    int rpm = Integer.parseInt(reader.readLine());

    System.out.println("Inserisci il costo:");
    double cost = Double.parseDouble(reader.readLine());

    return new Vynil(title, author, rpm, cost, new ArrayList<>());
  }
}
