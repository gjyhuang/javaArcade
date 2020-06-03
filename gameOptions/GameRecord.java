package gameOptions;

public class GameRecord {
  private String nameOfGame;
  private String nameOfUser;
  private String outcome;

  public GameRecord(String nameOfGame, String nameOfUser, String outcome) {
    this.nameOfGame = nameOfGame;
    this.nameOfUser = nameOfUser;
    this.outcome = outcome;
  }

  public String getNameOfGame() {
    return this.nameOfGame;
  }

  public void setNameOfGame(String nameOfGame) {
    this.nameOfGame = nameOfGame;
  }

  public String getNameOfUser() {
    return this.nameOfUser;
  }

  public void setNameOfUser(String nameOfUser) {
    this.nameOfUser = nameOfUser;
  }

  public String getOutcome() {
    return this.outcome;
  }

  public void setOutcome(String outcome) {
    this.outcome = outcome;
  }

  @Override
  public String toString() {
    return this.nameOfUser + " vs CPU, " + this.outcome;
  }
}
