package gameOptions;

import java.util.Scanner;

public class InputUtils {
  Scanner scan = new Scanner(System.in);


  public String getUserInput() {
    return scan.nextLine().toLowerCase();
  }

  public String getUserInputPreserveCaps() {
    return scan.nextLine();
  }

  public void closeScanner() {
    scan.close();
  }
}
