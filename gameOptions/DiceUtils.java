package gameOptions;

import java.util.Random;

public class DiceUtils {
  static Random rand = new Random();

  public static int rollDie() {
    return rand.nextInt(5) + 1;
  }
}
