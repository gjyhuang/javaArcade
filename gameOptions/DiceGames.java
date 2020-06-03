package gameOptions;

import java.util.ArrayList;

public class DiceGames {
  InputUtils inputUtils = new InputUtils();

  public void playHighLow(ArrayList<GameRecord> history, String user) {
    String keepPlaying;
    String result;
    do {
      System.out.println("");
      int cpuRoll = DiceUtils.rollDie();
      int playerRoll = DiceUtils.rollDie();

      if (cpuRoll > playerRoll) {
        System.out.println("The CPU rolled " + cpuRoll + " while you rolled " + playerRoll + ". You lost.");
        result = "loss";
      } else if (cpuRoll < playerRoll) {
        System.out.println("You rolled " + playerRoll + " while the CPU rolled " + cpuRoll + ". You won!");
        result = "win";
      } else {
        System.out.println("Both you and the CPU rolled " + cpuRoll + ". It's a draw.");
        result = "draw";
      }
      history.add(new GameRecord("High/Low", user, result));
      result = "";
      System.out.println("You just played high/low!");

      System.out.println("Would you like to keep playing? (Y/n)");
      keepPlaying = inputUtils.getUserInput();
    } while(!(keepPlaying.equals("n") || keepPlaying.equals("no")));
  }
}
