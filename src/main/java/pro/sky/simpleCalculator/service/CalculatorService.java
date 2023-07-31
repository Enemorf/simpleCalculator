package pro.sky.simpleCalculator.service;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService
{
    public int plus(String num1, String num2)
    {
        return Integer.parseInt(num1) + Integer.parseInt(num2);
    }

    public int minus(String num1, String num2)
    {
        return Integer.parseInt(num1) - Integer.parseInt(num2);
    }

    public int multiply(String num1, String num2)
    {
        return Integer.parseInt(num1) * Integer.parseInt(num2);
    }

    public int divide(String num1, String num2)
    {
        return Integer.parseInt(num1) / Integer.parseInt(num2);
    }
}
