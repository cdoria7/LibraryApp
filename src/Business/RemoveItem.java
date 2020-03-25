package Business;

import Business.BookshelfStrategy;
import Model.Product;

import java.util.Iterator;
import java.util.List;

public class RemoveItem implements BookshelfStrategy {

  @Override
  public void doSomething(List<Product> list, Product i) {
    Product p;
    Iterator<Product> iter = list.iterator();

    while(iter.hasNext()){
      p = iter.next();
      if(p.getName().equalsIgnoreCase(i.getName()) && p.getAuthor().equalsIgnoreCase(i.getAuthor())) {
        System.out.println("Ho rimosso il libro:\t" + p.getName() + " - " + p.getAuthor() + "\n");
        iter.remove();
        return;
      }
    }
    System.out.println("\nIl libro non è stato trovato.\nControlla il nome o l'autore.");
  }
}

