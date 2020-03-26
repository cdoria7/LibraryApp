package Model;

import java.io.IOException;
import java.util.List;

public class FirtEditionDecorator extends ProductDecorator{

  public FirtEditionDecorator(Product newProduct) {
    super(newProduct);
    getOptional().add("1° Edizione");
  }

  @Override
  public String show() {
    return tempProduct.show();
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
  public Product createProduct(){
    return tempProduct;
  }

  @Override
  public double getPrice() {
    return tempProduct.getPrice() + 15.50;
  }
}
