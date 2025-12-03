package h06;

public class FuelPoweredCar extends FuelPoweredVehicle{
    private static final double BASE_CONSUMPTION = 6.5;
    public FuelPoweredCar(FuelType fuelType, int fillingLevel) {
        super(fuelType, TransportType.CAR, fillingLevel);
    }

    /**
     * Take the amount of distance travel and calculate the fuel usage for fuel vehicle.
     * (6.5 litter per 100km)
     *
     * @param distance the vehicle travel
     * @return fuel usage of the vehicle to travel the given distance
     */
    @Override
    public double letMeMove(int distance){
        if(!this.motorRunning){
            return 0;
        }
        int fillingLevel = this.getFillingLevel();
        double fuelNeed = distance*(BASE_CONSUMPTION/100000);
        int fuelUsage = (int) fuelNeed;
        if (fuelUsage > fillingLevel){
            fuelUsage = fillingLevel;
            fuelNeed = fillingLevel;
        }
        this.fillingLevel -= fuelUsage;
        return fuelNeed;
    }


}
