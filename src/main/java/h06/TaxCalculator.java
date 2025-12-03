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
    public static double calculateTax(FuelPowered device,  double liters) {
        // TODO H6.5
        double cost;
        double tax = 0.2;
        if(device instanceof HybridPowered) {
            tax *= ((HybridPowered) device).getFuelElectricityRatio();
        }
        if(device.getFuelType() == FuelType.GASOLINE){
            cost = 1.72;
        }else if(device.getFuelType() == FuelType.DIESEL){
            cost = 1.6;
        }else{
            cost = 1.05;
        }
        return cost*liters*tax;
    }

}
