package h06;

import org.tudalgo.algoutils.student.annotation.DoNotTouch;

/**
 * Main entry point in executing the program.
 */
public class Main {

    /**
     * Main entry point in executing the program.
     *
     * @param args program arguments, currently ignored
     */
    public static void main(String[] args) {
        // TODO H6.6 Spielwiese

        //1
        FuelPoweredCar car = new FuelPoweredCar(FuelType.GASOLINE,0);
        System.out.println("1. Created Car. Current Fuel Level: " + car.getFillingLevel());

        //2
        car.fillUp(50);
        System.out.println("2. Filled up 50L. Current Fuel Level: " + car.getFillingLevel());

        //3
        car.turnOn();
        double carConsumed = car.letMeMove(100000);
        System.out.println("3. Car drove 100km. Consumed: " + carConsumed + "L (Expected: 6.5)");
        System.out.println("   Remaining Fuel: " + car.getFillingLevel());

        //4
        DrivableLawnMower mower = new DrivableLawnMower(FuelType.DIESEL, 5);
        System.out.println("\n4. Created Lawn Mower (Diesel, 5L).");

        //5
        mower.spinBlade();
        System.out.println("5. Spin blade while off -> isBladeSpinning: " + mower.isBladeSpinning() + " (Expected: false)");

        //6
        double mowerConsumed = mower.letMeMove(500);
        System.out.println("6. Move while off -> Consumed: " + mowerConsumed + "L (Expected: 0.0)");

        //7
        mower.turnOn();
        System.out.println("7. Lawn mower motor turned on.");

        //8
        double mowerConsumedOn = mower.letMeMove(20_000);
        System.out.println("8. Drive 20km (with 5L). Actually consumed: " + mowerConsumedOn + "L (Expected: 5.0)");
        System.out.println("   Remaining Fuel: " + mower.getFillingLevel());

        //9
        double taxCar = TaxCalculator.calculateTax(car, 20);
        System.out.println("\n9. Tax for 20L Gasoline (Car): " + taxCar + "€ (Expected: 6.88)");

        //10
        double taxMower = TaxCalculator.calculateTax(mower, 3);
        System.out.println("10. Tax for 3L Diesel (Mower): " + String.format("%.2f", taxMower) + "€ (Expected: 0.96)");

        //11
        HybridLawnMower hybridMower = new HybridLawnMower(FuelType.DIESEL, 6);
        System.out.println("\n11. Created Hybrid Mower (Diesel, 6L).");

        //12
        double taxHybrid = TaxCalculator.calculateTax(hybridMower, 3);
        System.out.println("12. Tax for 3L Diesel (Hybrid): " + taxHybrid + "€ (Expected: 0.864)");

        //13
        Chainsaw chainsaw = new Chainsaw();
        System.out.print("\n13. Starting Chainsaw: ");
        while (!chainsaw.isMotorRunning()) {
            chainsaw.attemptStart();
            System.out.print(".");
        }
        System.out.println(" Started!");

        //14
        chainsaw.addWood(new Wood(2.0, 5.0));
        chainsaw.addWood(new Wood(2.0, 5.0));
        System.out.println("14. Added 2 pieces of wood (Strength: 2.0, Depth: 5.0).");

        //15
        chainsaw.sawWood(10);
        System.out.println("15. Sawed for 10s. Remaining wood: " + chainsaw.getRemainingWood() + " (Expected: 1)");

        //16
        Smartphone phone = new Smartphone(
            exampleTokenDirectory(),
            exampleMessageReceiver()
        );
        System.out.println("\n16. Created Smartphone.");

        //17
        System.out.println("17. Using Smartphone (6 seconds):");
        phone.use(6);





    }

    /**
     * @return an example TokenDirectory that maps the placeholders used in {@link Main#exampleMessageReceiver}
     * to example values
     */
    @DoNotTouch
    private static TokenDictionary exampleTokenDirectory() {
        TokenDictionary dictionary = new TokenDictionary();
        dictionary.putToken("name", "Max Mustermann");
        dictionary.putToken("date", "26/06/2025");
        dictionary.putToken("animal", "Hund");
        dictionary.putToken("university", "TU Darmstadt");

        return dictionary;
    }

    /**
     * @return an example MessageReceiver that provides messages containing common placeholders such as name and date
     */
    @DoNotTouch
    private static MessageReceiver exampleMessageReceiver() {
        MessageReceiver receiver = new MessageReceiver();
        receiver.addMessage("Hello <name>, how are you doing");
        receiver.addMessage("<date> was a wild day");
        receiver.addMessage("Ich habe das an der <university> gelernt");

        return receiver;
    }
}
