package Controller;

import Business.*;
import Model.Bookshelf;

import java.io.IOException;

import static java.lang.System.exit;
import static java.lang.System.setOut;

public class Dispatcher {
  Bookshelf bookshelf;
  UpdateProduct updateProduct = new UpdateProduct();

  public Dispatcher(){
    bookshelf= new Bookshelf();
  }

  public void dispatch(String command) throws IOException {

    if(command.equalsIgnoreCase("add book")) {
      bookshelf.setProductStrategy(new AddProduct());
      bookshelf.operation(bookshelf.getShelf(), bookshelf.createProduct("Book"));
    }

    if(command.equalsIgnoreCase("add vynil")) {
      bookshelf.setProductStrategy(new AddProduct());
      bookshelf.operation(bookshelf.getShelf(), bookshelf.createProduct("Vynil"));
    }

    else if(command.equalsIgnoreCase("remove")){
      bookshelf.setProductStrategy(new RemoveProduct());
      bookshelf.operation(bookshelf.getShelf(), bookshelf.findProduct(bookshelf.getShelf()));
    }

    else if(command.equalsIgnoreCase("show")){
      bookshelf.setProductStrategy(new ShowProduct());
      bookshelf.operation(bookshelf.getShelf(), null);
    }
    else if(command.equalsIgnoreCase("update")){
      bookshelf.setProductStrategy(new UpdateProduct());
      bookshelf.operation(bookshelf.getShelf(), bookshelf.findProduct(bookshelf.getShelf()));
    }
    else if (command.equalsIgnoreCase("")){
    }
    else if(command.equalsIgnoreCase("quit")) {
      exit(0);
    }
    else System.out.println("Comando non riconosciuto prova con:\n•\tshow\n•\tadd\n•\tremove\n•\tupdate\n•\tquit");
  }



}

