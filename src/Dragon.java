public class Dragon {
    private String state = null;

    public Dragon(String mood) {
        this.state = mood;
    }

    public void response() {
        switch(this.state) {
            case "Hungry":
                System.out.println("You approach the cave...");
                System.out.println("It is dark and spooky...");
                System.out.println("A large dragon jumps out in front of you! He opens his jaws and...");
                System.out.println("Gobbles you down in one bite!");
                break;
            case "Friendly":
                System.out.println("You approach the cave...");
                System.out.println("It is dark and spooky...");
                System.out.println("A kind dragon presents his treasure...");
                System.out.println("and shares it with you");
                break;
            default:
                System.out.println("This dragon is broken.");
        }
    }
}
