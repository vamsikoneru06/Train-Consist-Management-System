import main.usecase18;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class usecase18test {

    @Test
    void testFound(){
        assertTrue(usecase18.search(
                new String[]{"A","B"},"B"));
    }
}