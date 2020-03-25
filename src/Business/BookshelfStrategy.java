package Business;

import Model.Product;

import java.io.IOException;
import java.util.List;

public interface BookshelfStrategy {

  void doSomething(List<Product> list, Product i);

}
