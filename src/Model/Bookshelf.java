package Model;

import Business.BookshelfStrategy;

import java.util.ArrayList;
import java.util.List;

public class Bookshelf{

  private BookshelfStrategy bookshelfStrategy;
  private List<Product> shelf;

  public Bookshelf(){
    shelf = new ArrayList<>();
    shelf.add(new Book("Zanna Bianca", "Jack London"));
    shelf.add(new Book("Il Codice Da Vinci", "Dan Brown"));
    shelf.add(new Book("Il ritratto di Dorian Gray", "Oscar Wilde"));
    shelf.add(new Book("Così parlò Zarathustra", "Friedrich Nietzsche"));
  }

  public void setBookshelfStrategy(BookshelfStrategy bookshelfStrategy) {
    this.bookshelfStrategy = bookshelfStrategy;
  }

  public List<Product> getShelf() {
    return shelf;
  }

  public void operation(List<Product> shelf, Product i) {
    bookshelfStrategy.doSomething(shelf, i);
  }


}
