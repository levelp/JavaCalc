import org.junit.Test;

import javax.script.ScriptException;

import static org.junit.Assert.assertEquals;

/**
 * Тестирование вычислений
 */
public class CalcTest {

    public static final double DELTA = 1e-10;

    @Test
    public void testCalcJS() throws ScriptException {
        assertEquals(4.0, Calc.calcJS("2*2"), DELTA);
        assertEquals(42.0, Calc.calcJS("40+2"), DELTA);
        assertEquals(2.0 + 3.0 * 10, Calc.calcJS("2.0+3.0*10"), DELTA);
        assertEquals(549.0, Calc.calcJS("2 + 7 * (9 * 9) - ((4 + 1) * (5 - 1))"), DELTA);
        //assertEquals(sin(3), CalcJS.calcJS("sin(3)"), 1e-10);
    }

    @Test
    public void testCalc() throws ScriptException {
        assertEquals(4.0, Calc.calc("2*2"), DELTA);
        assertEquals(42.0, Calc.calc("40+2"), DELTA);
        assertEquals(2.0 + 3.0 * 10, Calc.calc("2.0+3.0*10"), DELTA);
        assertEquals(549.0, Calc.calc("2 + 7 * (9 * 9) - ((4 + 1) * (5 - 1))"), DELTA);
    }
}
