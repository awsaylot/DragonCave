import java.util.Scanner;

public class Player {
    private int playerChoice;
    private Scanner getInput = new Scanner(System.in);


    public void setChoice(int choice) {
        playerChoice = choice;
    }
    public int getChoice() {
        return playerChoice;
    }
    public void getPlayerInput () {
        try {
            setChoice(getInput.nextInt());
        } catch (Exception e) {
            System.out.println("You have not made a choice...");
        }
    }
}
