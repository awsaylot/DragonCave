
public class Cave {
    private int friendlyDragon;


    public Cave(int seed) {
        this.friendlyDragon = seed;
    }


    public String getDragon(int choice) {
        if (choice == friendlyDragon) {
            return Dragon.getResponse("friendly");
        } else {
            return Dragon.getResponse("hungry");
        }
    }

}
