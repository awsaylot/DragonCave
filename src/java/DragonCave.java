import java.util.Scanner;
import java.util.Random;

public class DragonCave {
    private static void gameIntro() {
        System.out.println("You are in a land full of dragons. In front of you,");
        System.out.println("you see two caves. In one cave, the dragon is friendly");
        System.out.println("and will share his treasure with you. The other dragon");
        System.out.println("is greedy and hungry and will eat you on sight.");
        System.out.println("Which cave will you go into? (1 or 2)");
    }

    public static void main(String[] args) {
        Random seed = new Random();
        gameIntro();
        Cave newCave = new Cave(seed.nextInt(1));
        Player.setChoice(System.in);
        String response = newCave.getDragon(Player.getChoice());
        System.out.println(response);
    }
}