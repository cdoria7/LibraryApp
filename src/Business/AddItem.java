package Business;

import Model.Product;
import java.util.List;

public class AddItem implements BookshelfStrategy {
  @Override
  public void doSomething(List<Product> list, Product i) {
    list.add(i);
    System.out.println("Ho aggiunto un libro:\t" + i.getName() + " - " + i.getAuthor() + "\n");
  }
}
