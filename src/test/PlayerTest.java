import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    @DisplayName("Test get choice")
    void getChoice() {
        assertEquals(0, Player.getChoice());
    }

    @Test
    @DisplayName("Test set choice")
    void setChoice() {
        InputStream in = new ByteArrayInputStream("1".getBytes(StandardCharsets.UTF_8));
        Player.setChoice(in);
        assertEquals(0, Player.getChoice());
    }

    @AfterEach
    void tearDown() {
    }
}