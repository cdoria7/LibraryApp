package Model;

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

  public Vynil(String author, String title, List<String> optional, int rpm, double price) {
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
     return "Codice: "+ id + "\nTitolo: " +title+ "\t\tAutore: " +author+ "\n\trpm: " +rpm+ "\nPrezzo: " + price;
    else
      return   "Codice: "+ id + "\nTitolo: " +title+ "\nAutore: " +author+ "\n\trpm: " +rpm+ "\nPrezzo: " + price + "\nOptional: " + optional.toString();
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

}
