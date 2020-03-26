package Model;

import java.util.List;

public interface Product {

  String show();

  double getPrice();

  List<String> getOptional();

  String getProductId();

  String generateId();


}

