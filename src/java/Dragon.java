public class Dragon {
    private String state;
    private String approach = "You approach the cave...\nIt is dark and spooky...";
    private String hungryResponse = "\nA large dragon jumps out in front of you! He opens his jaws and...\nGobbles you down in one bite!";
    private String friendlyResponse = "\nA kind dragon presents his treasure...\nand shares it with you";

    public Dragon(String mood) {
        this.state = mood;
    }

    public String response() {
        switch(this.state) {
            case "Hungry":
                return approach + hungryResponse;
            case "Friendly":
                return approach + friendlyResponse;
            default:
                return "This dragon is broken.";
        }
    }
}
