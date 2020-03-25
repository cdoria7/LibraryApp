package Model;

public class Book implements Product {

  private String author;
  private String name;
  private double cost;

  public Book(String name, String author, double cost) {
    this.name = name;
    this.author = author;
    this.cost = cost;
  }

  @Override
  public double getCost() {
    return cost;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getAuthor() {
    return author;
  }

}
