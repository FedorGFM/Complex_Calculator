package metod.calculators;

import metod.ComplexNumber;

public interface InterfaceCalculableFactory {
    CanCalculable create(ComplexNumber arg);
}