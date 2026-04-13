import main.uc14;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class uc14test {

    @Test
    void testValidCapacityCreation() throws Exception {
        uc14.Bogie14 b = new uc14.Bogie14(50);
        assertEquals(50, b.capacity);
    }
}