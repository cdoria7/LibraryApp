package Model;

import java.util.List;

public abstract class ProductDecorator implements Product{

  protected Product tempProduct;

  public ProductDecorator(Product newProduct) {
    tempProduct = newProduct;
  }

  @Override
  public double getPrice() {
    return tempProduct.getPrice();
  }

  @Override
  public List<String> getOptional() {
    return tempProduct.getOptional();
  }
}
