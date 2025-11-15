package h06;

import org.tudalgo.algoutils.student.annotation.DoNotTouch;
import org.tudalgo.algoutils.student.annotation.StudentImplementationRequired;

import static org.tudalgo.algoutils.student.Student.crash;

/**
 * Utility class to calculate fuel taxes
 */
public final class TaxCalculator {

    @DoNotTouch
    private TaxCalculator() {
        // utility class should not be instantiated
    }

    /**
     * Calculates an imaginary tax for fuel powered devices.
     * The standard tax rate is 20%.
     * Hybrid devices get a discount related to their fuel/electricity ratio.
     *
     * @param device the fuel powered device to calculate taxes for
     * @param liters the amount of fuel in liters
     * @return the tax to be paid in Euros
     */
    @StudentImplementationRequired("H6.5")
    public static double calculateTax(/*FuelPowered device, */ double liters) {
        // TODO H6.5
        return crash("H6.5");
    }

}
