import java.io.InputStream;
import java.util.Scanner;

public class Player {
    private static int playerChoice = 0;


    public static int getChoice() {
        return playerChoice;
    }

    public static void setChoice (InputStream playerInput) {
        try{
            Scanner scan = new Scanner(playerInput);
            playerChoice = Integer.parseInt(scan.nextLine()) - 1;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
