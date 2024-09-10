import br.com.alexandremacedo.katas.RomanNumerals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralsTest {

    RomanNumerals romanNumerals = new RomanNumerals();

    @Test
    void testConvertOneToRomainI(){
        assertEquals("I",romanNumerals.integerToRoman(1));
    }

    @Test
    void testConvertFourToRomainIV(){
        assertEquals("IV", romanNumerals.integerToRoman(4));
    }

    @Test
    void testConvertNineToRomainIX(){
        assertEquals("IX", romanNumerals.integerToRoman(9));
    }
}
