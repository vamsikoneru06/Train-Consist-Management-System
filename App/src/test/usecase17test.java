import main.usecase17;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class usecase17test {

    @Test
    void testSort(){
        String[] arr = {"B","A"};
        assertArrayEquals(new String[]{"A","B"},
                usecase17.sort(arr));
    }
}