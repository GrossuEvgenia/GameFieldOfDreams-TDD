import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlayerTest {
    @Test
    public void Player(){
        Player player = new Player();
        Assertions.assertNotNull(player);
    }
}
