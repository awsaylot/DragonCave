
public class DragonCave {
    private static void gameIntro() {
        System.out.println("You are in a land full of dragons. In front of you,");
        System.out.println("you see two caves. In one cave, the dragon is friendly");
        System.out.println("and will share his treasure with you. The other dragon");
        System.out.println("is greedy and hungry and will eat you on sight.");
        System.out.println("Which cave will you go into? (1 or 2)");
    }

    public static void main(String[] args) {
        gameIntro();
        Cave spookyCave = new Cave();
        Player adventurer = new Player();
        adventurer.getPlayerInput();
        System.out.println(spookyCave.caveEntrance(adventurer.getChoice()));
    }
}