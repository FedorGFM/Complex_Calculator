package metod.calculators;

import metod.ComplexNumber;

public class CalculableFactory implements InterfaceCalculableFactory {
    public CanCalculable create(ComplexNumber arg) {
        return new Calculator(arg);
    }
}








//    public CanCalculable create(ComplexNumber arg) {
//        return new Calculator(arg);
//    }
//}