import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 100);
    }

    @Test
    public void hasPaper(){
        assertEquals(100, printer.getPaper());
    }
    @Test
    public void hasToner(){
        assertEquals(100, printer.getToner());
    }

    @Test
    public void canPrint(){
        assertEquals(90, printer.print(5,2));
    }

    @Test
    public void noPaper(){
        assertEquals(100, printer.print(100,2));
    }

    @Test
    public void refillPaper(){
        assertEquals(100, printer.refill(100));
    }

}
