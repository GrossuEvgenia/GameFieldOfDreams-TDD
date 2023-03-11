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

    @Test
    public void reduceNumberOfLives(){
        Player player = new Player();
        player.setNumberOfLives(5);
        int expected = 4;

        player.reduceNumberOfLives();

        Assertions.assertEquals(expected, player.getNumberOfLives());
    }
    @Test
    public void addGuessedLetters(){
        Player player = new Player();
        int expected =1 ;

        player.addGuessedLetters(1);

        Assertions.assertEquals(expected, player.getGuessedLetters());
    }
}
