package Business;

import Model.Product;

import java.util.List;

public class RemoveProduct implements ProductStrategy {

  @Override
  public void productCrud(List<Product> list, Product p) {
    list.remove(p);
    if(!list.contains(p) && p != null)
      System.out.println("Il prodotto è stato elimanato con successo!");
  }
}

