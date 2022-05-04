import java.util.Random;

public class Cave {
    private int friendlyDragon;
    private int hungryDragon;
    Dragon spyro;
    Dragon smaug;

    //Constructor determines which dragon the player will meet.
    public Cave() {
        Random rand = new Random();
        friendlyDragon = 2 - rand.nextInt(2);
        if (friendlyDragon == 2) {
            hungryDragon = 1;
        } else {
            hungryDragon = 2;
        }
    }

    //Method determines which cave the player chose. If chosen correctly
    public String caveEntrance(int whichCave) {
        if (whichCave == friendlyDragon){
            spyro = new Dragon("Friendly");
            return spyro.response();
        } else if (whichCave == hungryDragon){
            smaug = new Dragon("Hungry");
            return smaug.response();
        } else {
            return "Both dragons come out and eat you.";
        }
    }
}
