import main.usecase15;
import main.CargoSafetyException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class usecase15test {

    @Test
    void testSafeCase(){
        assertDoesNotThrow(() ->
                usecase15.assign("Cylindrical","Coal"));
    }

    @Test
    void testUnsafeCase(){
        assertThrows(CargoSafetyException.class,
                () -> usecase15.assign("Rectangular","Petroleum"));
    }
}