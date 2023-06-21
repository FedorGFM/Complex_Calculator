import metod.calculators.Calculator;

public class Main {
    public static void main(String[] args) {

        CalculatorView calculatorView = new CalculatorView(Calculator::new);
        calculatorView.run();
    }
}
