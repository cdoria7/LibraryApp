package Controller;

import Business.*;
import Model.Bookshelf;

import java.io.IOException;

import static java.lang.System.exit;

public class Dispatcher {
  Bookshelf bookshelf;
  ModProduct modProduct = new ModProduct();

  public Dispatcher(){
    bookshelf= new Bookshelf();
  }

  public void dispatch(String command) throws IOException {

    if(command.equalsIgnoreCase("add")) {
      bookshelf.setBookshelfStrategy(new AddItem());
      bookshelf.operation(bookshelf.getShelf(), modProduct.applyDecorator(bookshelf.createProduct()));
    }
    else if(command.equalsIgnoreCase("remove")){
      bookshelf.setBookshelfStrategy(new RemoveItem());
      bookshelf.operation(bookshelf.getShelf(), bookshelf.findProduct());
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



}

