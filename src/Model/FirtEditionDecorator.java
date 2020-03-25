package Model;

public class FirtEditionDecorator extends ProductDecorator{

  public FirtEditionDecorator(Product newProduct) {
    super(newProduct);
    System.out.println("Applico la prima edizione");
  }

  @Override
  public String getAuthor() {
    return tempProduct.getAuthor();
  }

  @Override
  public String getName() {
    return tempProduct.getName() + "[ 1°Ed ]";
  }

  @Override
  public double getCost() {
    return tempProduct.getCost() + 15.50;
  }
}
