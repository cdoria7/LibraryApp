package Business;

import Model.Product;

import java.io.IOException;
import java.util.List;

public interface ProductStrategy {

  void productCrud(List<Product> list, Product i) throws IOException;

}
