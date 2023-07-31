package pro.sky.simpleCalculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest
{

    private String a,b,c,d,e;
    private final CalculatorService  out = new CalculatorService();

    @BeforeEach
    public void setUp()
    {
        a = "5";
        b = "7";
        c = "-3";
        d = "0";
        e = "";
    }
    @Test
    public void plusPositiveTest()
    {
        assertEquals(Integer.parseInt(a) + Integer.parseInt(b), out.plus(a,b));
        assertEquals( Integer.parseInt(c) + Integer.parseInt(d) , out.plus(c, d));
    }
    @Test
    public void plusNegativeTest()
    {
        assertDoesNotThrow( () ->
                out.plus(c, a));

        assertThrows(IllegalArgumentException.class,() ->
                out.plus(a, e));
    }
    @Test
    public void minusPositiveTest() {
        assert Integer.parseInt(b) - Integer.parseInt(c) == out.minus(b, c);
        assert Integer.parseInt(a) - Integer.parseInt(b) == out.minus(a, b);

    }
    @Test
    public void minusNegativeTest()
    {
        assertDoesNotThrow( () ->
                out.minus(c, b));

        assertThrows(IllegalArgumentException.class,() ->
                out.minus(b, e));
    }
    @Test
    public void multiplyPositiveTest()
    {
        assert Integer.parseInt(c) * Integer.parseInt(d) == out.multiply(c, d);
        assert Integer.parseInt(a) * Integer.parseInt(c) == out.multiply(a, c);

    }
    @Test
    public void multiplyNegativeTest() {
        assertDoesNotThrow( () ->
                out.multiply(c, c));
        assertThrows(IllegalArgumentException.class,() ->
                out.multiply(c, e));
    }
    @Test
    public void dividePositiveTest()
    {
        assert Integer.parseInt(d) / Integer.parseInt(c) == out.divide(d, c);
        assert Integer.parseInt(a) / Integer.parseInt(b) == out.divide(a, b);
    }
    @Test
    public void divideNegativeTest()
    {
        assertDoesNotThrow( () ->
                out.divide(a, a));
        assertThrows(IllegalArgumentException.class,() ->
                out.divide(d, e));
    }
    @Test
    public void divideByZeroTest()
    {
        assertThrows(ArithmeticException.class,() ->
                out.divide(a, d));
    }

}
