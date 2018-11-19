import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calc;

    @Before
    public void before(){
        calc = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(5, calc.add(2,3));
    }

    @Test
    public void canSubtract(){
        assertEquals(5, calc.subtract(10,5));
    }

    @Test
    public void canMultiply(){
        assertEquals(6, calc.multiply(2,3));
    }

    @Test
    public void canDivide(){
        assertEquals(5, calc.divide(15,3));
    }

}
