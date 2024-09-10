import br.com.alexandremacedo.FizzBuzz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void testReturnNumber() {
        assertEquals("1", fizzBuzz.fizzBuzz(1));
    }

    @Test
    void testFizzForThree(){
        assertEquals("Fizz", fizzBuzz.fizzBuzz(3));
    }
}
