import main.usecase19;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class usecase19test {

    @Test
    void testBinary(){
        assertTrue(usecase19.search(
                new String[]{"B","A","C"},"C"));
    }
}