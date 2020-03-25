package Business;

import Model.AutographDecorator;
import Model.FirtEditionDecorator;
import Model.Product;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ModProduct {

  public ModProduct() {
  }

  /**
   *
   * @param p prodotto da "decorare".
   * @return ritorna il prodotto decorato.
   * @throws IOException
   *
   * Il metodo si occupa della decorazione dell'oggetto e del relativo menu.
   */
  public Product applyDecorator(Product p ) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    while(true) {
      System.out.println("Vuoi inserire un'aggiunta al libro? ( S / N )");
      String result = reader.readLine();

      if (result.equalsIgnoreCase("s")) {
        System.out.println("Scegli una decorazione tra:\n • 1ed;\n • autograph;\n");
        String decoration = reader.readLine();
        p = selectDecoration(decoration, p);
      }
      else if (result.equalsIgnoreCase("n")) return p;
      else System.out.println("Inserisci S / N ");
    }
  }
  private Product selectDecoration(String decoration, Product p) {

    switch (decoration) {
      case "1ed":
        p = new FirtEditionDecorator(p);
        break;

      case "autograph":
        p = new AutographDecorator(p);
        break;

      default:
        System.out.println("Decorazione non trovata");
        break;
    }
    return p;
  }
}
