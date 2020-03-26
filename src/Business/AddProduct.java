package Business;

import Model.Product;
import java.util.List;

public class AddProduct implements ProductStrategy {
  @Override
  public void productCrud(List<Product> list, Product p) {
    list.add(p);
    System.out.println("Ho aggiunto un prodotto:\n" + p.show());
  }
}
