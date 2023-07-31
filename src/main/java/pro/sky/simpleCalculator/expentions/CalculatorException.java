package pro.sky.simpleCalculator.expentions;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@ControllerAdvice
public class CalculatorException
{
    @ExceptionHandler(NumberFormatException.class)
    @GetMapping(path = "/error")
    public void handleException(NumberFormatException e)
    {
        System.out.println("Не все параметры для калькулятора заданы");
    }
    @ExceptionHandler(NotNumberException.class)
    public void handleException(NotNumberException e)
    {
        System.out.println("где-то введено не числовое значение");
    }
    @ExceptionHandler(ArithmeticException.class)
    public void handleException(ArithmeticException e)
    {
        System.out.println("идет деление на ноль");
    }


}
