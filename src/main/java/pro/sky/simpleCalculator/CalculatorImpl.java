package pro.sky.simpleCalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.simpleCalculator.service.CalculatorService;

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorImpl
{
    public final CalculatorService calculatorService;
    public CalculatorImpl(CalculatorService calculatorService)
    {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "")
    public String welcome()
    {
        return "Welcome to the calculator";
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam("num1") String num1, @RequestParam("num2") String num2)
            throws IllegalArgumentException
    {
        return num1 + " + " + num2 + " = " + calculatorService.plus(num1, num2);
    }


    @GetMapping(path ="/minus")
    public String minus(@RequestParam("num1") String num1, @RequestParam("num2") String num2)
            throws IllegalArgumentException
    {
        return num1 + " - " + num2 + " = " + calculatorService.minus(num1, num2);
    }


    @GetMapping(path ="/multiply")
    public String multiply(@RequestParam("num1") String num1, @RequestParam("num2") String num2)
            throws IllegalArgumentException
    {
        return num1 + " * " + num2 + " = " + calculatorService.multiply(num1, num2);
    }


    @GetMapping(path ="/divide")
    public String divide(@RequestParam("num1") String num1, @RequestParam("num2") String num2)
            throws IllegalArgumentException
    {
        return num1 + " / " + num2 + " = " + calculatorService.divide(num1, num2);
    }

}
