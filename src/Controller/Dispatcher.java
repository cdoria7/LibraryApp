package Controller;

import Business.AddItem;
import Business.BookshelfStrategy;
import Business.RemoveItem;
import Business.ShowItem;
import Model.Book;
import Model.Bookshelf;
import Model.Product;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.exit;

public class Dispatcher {
  Bookshelf bookshelf;

  public Dispatcher(){
    bookshelf= new Bookshelf();
  }

  public void dispatch(String command) throws IOException {

    if(command.equalsIgnoreCase("add")) {
      bookshelf.setBookshelfStrategy(new AddItem());
      bookshelf.operation(bookshelf.getShelf(), selectProduct());
    }
    else if(command.equalsIgnoreCase("remove")){
      bookshelf.setBookshelfStrategy(new RemoveItem());
      bookshelf.operation(bookshelf.getShelf(), selectProduct());
    }
    else if(command.equalsIgnoreCase("show")){
      bookshelf.setBookshelfStrategy(new ShowItem());
      bookshelf.operation(bookshelf.getShelf(), null);
    }
    else if(command.equalsIgnoreCase("quit")) {
      exit(0);
    }
    else System.out.println("Comando non riconosciuto prova con:\n•\tshow\n•\tadd\n•\tremove");
  }

  private Product selectProduct() throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Inserisci il titolo:");
    String title = reader.readLine();
    System.out.println("Inserisci l'autore:");
    String author = reader.readLine();
    return new Book(title, author);
  }

}

