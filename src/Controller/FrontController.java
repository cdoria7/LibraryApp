package Controller;

import java.io.IOException;

public class FrontController {

  private Dispatcher dispatcher;

  public FrontController(){
    dispatcher = new Dispatcher();
  }

  public void dispatchRequest(String command) throws IOException {
    dispatcher.dispatch(command);
  }

}
