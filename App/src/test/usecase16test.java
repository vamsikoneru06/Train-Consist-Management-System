import main.usecase16;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class usecase16test {

    @Test
    void testSorting(){
        int[] arr = {5,2,1};
        assertArrayEquals(new int[]{1,2,5},
                usecase16.sort(arr));
    }
}