package katas.bowlinggame;

public class Application {

  private DialogController dialogController;
  private IOController ioController;

  public Application(DialogController dialogController, IOController ioController) {
    this.dialogController = dialogController;
    this.ioController = ioController;
  }

  public void start() {
    dialogController.printGreetingAndGetUserName();
  }

  public void showOptionMenu() {
    dialogController.showOptionMenu();
    String userInput = ioController.getUserInput();

    if (userInput.equals("1")) {
      dialogController.startGame();
    } else {
      throw new UnsupportedOperationException();
    }
  }
}