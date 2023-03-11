import org.example.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlayerTest {
    @Test
    public void Player(){
        Player player = new Player();
        Assertions.assertNotNull(player);
    }

    @Test
    public void initializationGuessedWord(){
        char expected[] = {'_','_','_','_'};
        Player player = new Player();

        player.initializationGuessedWord(4);
        Assertions.assertArrayEquals(expected, player.getGuessedWord());
    }
}
