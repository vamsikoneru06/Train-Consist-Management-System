import main.usecase20;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class usecase20test {

    @Test
    void testException(){
        assertThrows(IllegalStateException.class,
                () -> usecase20.search(new String[]{}, "A"));
    }
}