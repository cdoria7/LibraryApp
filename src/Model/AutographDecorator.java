package Model;

public class AutographDecorator extends ProductDecorator {

  public AutographDecorator(Product newProduct) {
    super(newProduct);
    System.out.println("Applico l'autografo");
  }

  @Override
  public String getAuthor() {
    return tempProduct.getAuthor();
  }

  @Override
  public String getName() {
    return tempProduct.getName() + "[ Autograph ]";
  }

  @Override
  public double getCost() {
    return tempProduct.getCost() + 5.00;
  }
}
