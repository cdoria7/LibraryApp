package Model;

public class Book implements Product {

  private String author;
  private String name;

  public Book(String name, String author) {
    this.name = name;
    this.author = author;
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
