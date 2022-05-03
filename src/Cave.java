import java.util.Random;

public class Cave {
    private int friendlyDragon;
    Dragon spyro;
    Dragon smaug;

    //Constructor determines which dragon the player will meet.
    public Cave() {
        Random rand = new Random();
        friendlyDragon = rand.nextInt(2) + 1;
    }

    //Method determines which cave the player chose. If chosen correctly
    public void caveEntrance(int whichCave) {
        if (whichCave == friendlyDragon){
            spyro = new Dragon("Friendly");
            spyro.response();
        } else {
            smaug = new Dragon("Hungry");
            smaug.response();
        }
    }
}
