package Model;

import java.io.IOException;
import java.util.List;

public interface Product {

  String show();

  double getPrice();

  List<String> getOptional();

  String getProductId();

  String generateId();

  Product createProduct() throws IOException;


}

