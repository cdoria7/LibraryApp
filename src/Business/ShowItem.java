package Business;

import Model.Product;

import java.util.Iterator;
import java.util.List;

public class ShowItem implements BookshelfStrategy {

  @Override
  public void doSomething(List<Product> list, Product i) {
    System.out.println("Ecco l'elenco dei libri:");
    Iterator<Product> iter = list.iterator();
    Product c;
    int index = 1;
    while (iter.hasNext()) {
      c = iter.next();
      System.out.println(index + "] " + c.getName() + " - " + c.getAuthor());
      index += 1;
    }
    System.out.println();
  }

}