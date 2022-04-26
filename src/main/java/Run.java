import service.Calculator;
import service.CalculatorImpl;

public class Run {

    public static void main(String[] args) {

        Calculator calculator = new CalculatorImpl();

        var result = calculator.sum(100, 100);

        System.out.println(result);

    }
}
