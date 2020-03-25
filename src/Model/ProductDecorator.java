package Model;

public abstract class ProductDecorator implements Product{

  protected Product tempProduct;

  public ProductDecorator(Product newProduct) {
    tempProduct = newProduct;
  }

  @Override
  public double getCost() {
    return tempProduct.getCost();
  }

  @Override
  public String getName() {
    return tempProduct.getName();
  }

  @Override
  public String getAuthor() {
    return tempProduct.getAuthor();
  }
}
