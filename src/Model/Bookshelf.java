package Model;

import Business.ProductStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bookshelf {

  private ProductStrategy productStrategy;
  private List<Product> shelf;

  /**
   * Costruisco una libreria di partenza
   */
  public Bookshelf() {
    shelf = new ArrayList<>();
    List<String> optional = new ArrayList<>();
    optional.add("1° Edizione");
    optional.add("Autografata");
    shelf.add(new Book("Zanna Bianca", "Jack London", 15, optional));
    shelf.add(new Book("Il Codice Da Vinci", "Dan Brown", 15, new ArrayList<>()));
    shelf.add(new Book("Il ritratto di Dorian Gray", "Oscar Wilde", 15, optional));
    shelf.add(new Book("Così parlò Zarathustra", "Friedrich Nietzsche", 15, new ArrayList<>()));
  }

  /**
   * @param productStrategy strategia da adottare
   */
  public void setProductStrategy(ProductStrategy productStrategy) {
    this.productStrategy = productStrategy;
  }

  public List<Product> getShelf() {
    return shelf;
  }

  public void operation(List<Product> shelf, Product i) throws IOException {
    productStrategy.productCrud(shelf, i);
  }

  public Product findProduct(List<Product> list) throws IOException {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Inserisci l'id del prodotto da rimuovere:");
    String id = reader.readLine();

    Iterator<Product> iterator = list.iterator();
    Product p;

    while (iterator.hasNext()) {
      p = iterator.next();
      if (p.getProductId().equals(id))
        return p;
    }
    System.out.println("Non ho trovato nessun prodotto con questo id");
    return null;
  }

  public Product createProduct(String type) throws IOException {
    switch (type){
      case "Book":
        Book book = new Book();
        return book.createProduct();

      case "Vynil":
        Vynil vynil = new Vynil();
        return vynil.createProduct();
    }
    return null;
  }
}



