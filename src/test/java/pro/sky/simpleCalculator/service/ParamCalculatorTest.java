package pro.sky.simpleCalculator.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ParamCalculatorTest
{

    private final CalculatorService out = new CalculatorService();
    public static Stream<Arguments> paramsForTest()
    {
        return Stream.of(
                Arguments.of("2", "511"),
                Arguments.of("3", "232"),
                Arguments.of("4", "-534"),
                Arguments.of("5", "123")
        );
    }

    @ParameterizedTest
    @MethodSource("paramsForTest")
    public void plusTest(String a, String b)
    {
        assert Integer.parseInt(a) + Integer.parseInt(b) == out.plus(a, b);
    }

    @ParameterizedTest
    @MethodSource("paramsForTest")
    public void minusTest(String a, String b)
    {
        assert Integer.parseInt(a) - Integer.parseInt(b) == out.minus(a, b);
    }


    @ParameterizedTest
    @MethodSource("paramsForTest")
    public void multiplyTest(String a, String b)
    {
        assert Integer.parseInt(a) * Integer.parseInt(b) == out.multiply(a, b);
    }

    @ParameterizedTest
    @MethodSource("paramsForTest")
    public void divideTest(String a, String b)
    {
        assert Integer.parseInt(a) / Integer.parseInt(b) == out.divide(a, b);
    }
}
