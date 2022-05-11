public class Dragon {
    private static String approach = "You approach the cave...\nIt is dark and spooky...";
    private static String hungryResponse = "\nA large dragon jumps out in front of you! He opens his jaws and...\nGobbles you down in one bite!";
    private static String friendlyResponse = "\nA kind dragon presents his treasure...\nand shares it with you";


    public static String getResponse(String dragon) {
        if (dragon.equals("friendly")) {
            return approach + friendlyResponse;
        }
        return approach + hungryResponse;
    }
}
