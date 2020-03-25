package Model;

import Business.AddItem;
import Business.BookshelfStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Bookshelf{

  private BookshelfStrategy bookshelfStrategy;
  private List<Product> shelf;

  /**
   * Costruisco una libreria di partenza
   */
  public Bookshelf(){
    shelf = new ArrayList<>();
    shelf.add(new Book("Zanna Bianca", "Jack London", 15));
    shelf.add(new Book("Il Codice Da Vinci", "Dan Brown", 15));
    shelf.add(new Book("Il ritratto di Dorian Gray", "Oscar Wilde", 15));
    shelf.add(new Book("Così parlò Zarathustra", "Friedrich Nietzsche", 15));
  }

  /**
   *
   * @param bookshelfStrategy strategia da adottare
   */
  public void setBookshelfStrategy(BookshelfStrategy bookshelfStrategy) {
    this.bookshelfStrategy = bookshelfStrategy;
  }

  public List<Product> getShelf() {
    return shelf;
  }

  public void operation(List<Product> shelf, Product i) {
    bookshelfStrategy.doSomething(shelf, i);
  }

  public Product createProduct() throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Inserisci il titolo:");
    String title = reader.readLine();

    System.out.println("Inserisci l'autore:");
    String author = reader.readLine();

    System.out.println("Inserisci il costo:");
    double cost = Double.parseDouble(reader.readLine());

    return new Book(title, author, cost);
  }

  public Product findProduct() throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Inserisci il titolo del prodotto da rimuovere:");
    String title = reader.readLine();

    System.out.println("Inserisci l'autore del prodotto da rimuovere:");
    String author = reader.readLine();

    return new Book(title, author, 0);

  }


}
