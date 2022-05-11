import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaveTest {

    Cave cave;

    @BeforeEach
    void setUp() {
        cave = new Cave(0);
    }

    @Test
    @DisplayName("Testing get dragon")
    void getDragon() {
        String friendlyResponse = "You approach the cave...\nIt is dark and spooky..." + "\nA kind dragon presents his treasure...\nand shares it with you";
        assertEquals(friendlyResponse, cave.getDragon(0), "Get dragon failed.");
    }

    @AfterEach
    void tearDown() {
    }


}