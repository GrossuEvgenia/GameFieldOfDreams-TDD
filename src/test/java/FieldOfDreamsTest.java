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
}
