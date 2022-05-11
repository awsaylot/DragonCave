import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DragonTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    @DisplayName("Testing get response")
    void getResponse() {
        String friendlyResponse = "You approach the cave...\nIt is dark and spooky..." + "\nA kind dragon presents his treasure...\nand shares it with you";
        String hungryResponse = "You approach the cave...\nIt is dark and spooky..." + "\nA large dragon jumps out in front of you! He opens his jaws and...\nGobbles you down in one bite!";
        assertEquals(friendlyResponse, Dragon.getResponse("friendly"));
        assertEquals(hungryResponse, Dragon.getResponse("hungry"));
    }

    @AfterEach
    void tearDown() {
    }


}