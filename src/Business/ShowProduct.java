package Business;

import Model.Product;

import java.util.Iterator;
import java.util.List;

public class ShowProduct implements ProductStrategy {

  /**
   * Il metodo si occupa di scorrere la lista passata come argomento
   * e stampare le informazioni relative ad ogni prodotto.
   */
  @Override
  public void productCrud(List<Product> list, Product p) {
    System.out.println("Ecco l'elenco dei libri:\n");
    Iterator<Product> iter = list.iterator();
    Product c;

    while (iter.hasNext()) {
      c = iter.next();
      System.out.println(c.show() + "\n");
    }
  }

}
