import java.util.ArrayList;

import gameOptions.DiceGames;
import gameOptions.GameRecord;
import gameOptions.InputUtils;

class Main {
  // this is an instance method, not a static one (because Main defaults to static). can't be accessed in static methods, but can access in the instance methods
  static ArrayList<GameRecord> history = new ArrayList<>();

  public static void main(String[] args) {
    String menuOption;
    DiceGames diceGames = new DiceGames();
    InputUtils inputUtils = new InputUtils();
    Main main = new Main();

    System.out.println("Hey there!");
    System.out.print("What's your name? ");
    String user = inputUtils.getUserInputPreserveCaps();

    do {
      System.out.println("");
      displayMenuOptions();
      menuOption = inputUtils.getUserInput();

      switch(menuOption) {
        case "1":
          diceGames.playHighLow(history, user);
          break;
        case "d":
          main.displayHistory();
          break;
        case "c":
          System.out.print("What would you like to change it to? ");
          user = inputUtils.getUserInputPreserveCaps();
        default:
          break;
      }

    } while(!menuOption.equals("q"));

    System.out.println("Program finished!");

    inputUtils.closeScanner();
  }

  public static void displayMenuOptions() {
    System.out.println("Please enter 1 to play high/low.");
    System.out.println("Please enter c to change your user name.");
    System.out.println("Please enter d to view play history.");
    System.out.println("Please enter q to quit.");
    System.out.print("Please make a selection: ");
  }

  public void displayHistory() {
    for (int i = 0; i < history.size(); i++) {
      System.out.println("Game no." + i + ": " + history.get(i));
    }
  }
}
