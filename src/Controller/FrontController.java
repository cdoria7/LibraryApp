package Controller;

import java.io.IOException;

public class FrontController {

  private Dispatcher dispatcher;

  public FrontController() throws IOException {
    dispatcher = new Dispatcher();
  }

  public void dispatchRequest(String command) throws IOException {
    dispatcher.dispatch(command);
  }

}
