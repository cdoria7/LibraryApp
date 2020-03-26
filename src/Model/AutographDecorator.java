package Model;

import java.util.List;

public class AutographDecorator extends ProductDecorator {

  public AutographDecorator(Product newProduct) {
    super(newProduct);
    getOptional().add("Autografato");
  }

  @Override
  public String show() {
    return null;
  }

  @Override
  public List<String> getOptional() {
    return tempProduct.getOptional();
  }

  @Override
  public String getProductId() {
    return tempProduct.getProductId();
  }

  @Override
  public String generateId() {
    return tempProduct.getProductId();
  }

  @Override
  public double getPrice() {
    return tempProduct.getPrice() + 5.00;
  }
}
