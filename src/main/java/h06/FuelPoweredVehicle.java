package h06;

public abstract class FuelPoweredVehicle extends MeansOfTransport implements FuelPowered{
    /**
     * The amount of fuel in litter
     */
    protected boolean motorRunning;
    protected int fillingLevel;
    private final FuelType fuelType;

    public FuelPoweredVehicle(FuelType fuelType, TransportType transportType, int fillingLevel) {
        super(transportType);
        this.fuelType = fuelType;
        this.fillingLevel = fillingLevel;
    }

    @Override
    public FuelType getFuelType(){
        return this.fuelType;
    }

    /**
     * Return the amount of fuel in litter
     * @return the amount of fuel in litter
     */
    public int getFillingLevel() {
        return fillingLevel;
    }

    /**
     * Fill up the tank by the given amount
     * @param fillValue the amount to fill up
     */
    public void fillUp(int fillValue){
        if(fillValue>0){
            fillingLevel+=fillValue;
        }
    }

    public void turnOn(){
        motorRunning = true;
    }
    public void turnOff(){
        motorRunning = false;
    }
}
