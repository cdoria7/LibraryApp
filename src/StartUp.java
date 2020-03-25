import Controller.FrontController;
import Model.Book;
import Model.FirtEditionDecorator;
import Model.Product;
import sun.jvm.hotspot.debugger.win32.coff.TestDebugInfo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StartUp {
  public static void main(String[] args) throws IOException {

    System.out.println("Usa i comandi:\n•\tshow\n•\tadd\n•\tremove");
    FrontController frontController = new FrontController();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    while(true){
      String command = reader.readLine();
      frontController.dispatchRequest(command);
    }



  }
}
