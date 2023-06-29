import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SnackTest {
    @Test
    public void testSnack(){
        Snack s = new Snack("Binch", 1500);
        assertEquals(1500, s.getPrice());
        s.addPrice(2000);
        assertEquals(3500, s.getPrice());
    }
}
