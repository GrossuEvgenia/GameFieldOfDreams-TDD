import org.example.FieldOfDreams;
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
}
