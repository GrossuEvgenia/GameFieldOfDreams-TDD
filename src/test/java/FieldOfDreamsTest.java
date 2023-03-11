import org.example.FieldOfDreams;
import org.example.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FieldOfDreamsTest {
    @Test
    public void FieldOfDreams(){
        FieldOfDreams field = new FieldOfDreams();
        Assertions.assertNotNull(field);
    }

    @Test
    public void getQandAOnFile(){
        FieldOfDreams field = new FieldOfDreams();

        String expectedQ = "КАКАЯ ПТИЧКА ЯВЛЯЕТСЯ САМОЙ МАЛЕНЬКОЙ";
        String expectedA ="КОЛИБРИ";

        field.getQandAOnFile();

        String actualQ=field.getQuestion();
        String actualA=field.getAnswer();

        Assertions.assertEquals(expectedQ,actualQ);
        Assertions.assertEquals(expectedA,actualA);
    }
    @Test
    public void initializationPlayer(){
        FieldOfDreams field = new FieldOfDreams();
        field.setAnswer("КОЛИБРИ");

        int expectedLives=7;
        char expectedWord[]={'_','_','_','_','_','_','_'};

        field.initializationPlayer();
        int actualLives = field.getPlayer().getNumberOfLives();
        char actualWord[] = field.getPlayer().getGuessedWord();

        Assertions.assertEquals(expectedLives, actualLives);
        Assertions.assertArrayEquals(expectedWord,actualWord);
    }

    @Test
    public void checkWords(){
        FieldOfDreams field = new FieldOfDreams();
        field.setAnswer("КОЛИБРИ");

        Boolean actual = field.checkWords("КОЛИБРИ");
        Assertions.assertTrue(actual);

        Boolean actual1 = field.checkWords("колибри");
        Assertions.assertTrue(actual1);
    }

    @Test
    public void tryGuessWord(){
        FieldOfDreams field = new FieldOfDreams();
        field.setAnswer("КОЛИБРИ");
        Player player = new Player();
        player.setNumberOfLives(7);
        field.setPlayer(player);
        int expectedLives=0;

        field.tryGuessedWord("БОЛИВИЯ");
        int actualLives=field.getPlayer().getNumberOfLives();
        Assertions.assertEquals(expectedLives,actualLives);

        int expectedLetter =7;

        field.tryGuessedWord("КОЛИБРИ");
        int actualLetter=field.getPlayer().getGuessedLetters();
        Assertions.assertEquals(expectedLetter,actualLetter);

    }

    @Test
    public void checkLetter(){
        FieldOfDreams field = new FieldOfDreams();
        field.setAnswer("КОЛИБРИ");

        Boolean actual = field.checkLetter('Л');
        Assertions.assertTrue(actual);

        Boolean actual1 = field.checkLetter('л');
        Assertions.assertTrue(actual1);
    }
    @Test
    public void tryGuessLetter(){
        FieldOfDreams field = new FieldOfDreams();
        field.setAnswer("КОЛИБРИ");
        Player player = new Player();
        player.setGuessedWord(new char[]{'_','_','_','_','_','_','_'});
        player.setNumberOfLives(7);
        field.setPlayer(player);

        int expectedLives=6;
        field.tryGuessedLetter('Ю');
        int actualLives=field.getPlayer().getNumberOfLives();
        Assertions.assertEquals(expectedLives,actualLives);

        int expectedLetter =2;
        field.tryGuessedLetter('И');
        int actualLetter=field.getPlayer().getGuessedLetters();
        Assertions.assertEquals(expectedLetter,actualLetter);

        player.setNumberOfLives(7);
        player.setGuessedWord(new char[]{'_','_','_','И','_','_','И'});
        field.setPlayer(player);
        expectedLives=6;
        field.tryGuessedLetter('И');
        actualLives=field.getPlayer().getNumberOfLives();
        Assertions.assertEquals(expectedLives,actualLives);



    }
}
