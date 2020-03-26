package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Book implements Product {

  private String id;
  private String author;
  private String title;
  private double price;
  private List<String> optional = new ArrayList<>();

  /**
   * Constructors
   */
  public Book() {
  }

  public Book(String author, String title, double price, List<String> optional) {
    this.id = generateId();
    this.author = author;
    this.title = title;
    this.price = price;
    this.optional = optional;
  }

  /**
   * Methods of Product Interface
   */
  @Override
  public String show() {
    if(optional.isEmpty())
      return  "Codice: " +id+ "\nTitolo: " +title+ "\nAutore: " +author+ "\nPrezzo: " + price;
    else
      return  "Codice: " +id+ "\nTitolo: " +title+ "\nAutore: " +author+ "\nPrezzo: " + price + "\nOptional: " + optional.toString();
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
  public String generateId() {
    return UUID.randomUUID().toString();
  }

  @Override
  public double getPrice() {
    return price;
  }

  public String getTitle(){
    return title;
  }

}
