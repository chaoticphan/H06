package h06;

public class DrivableLawnMower extends FuelPoweredVehicle{
    static final double BASE_CONSUMPTION = 0.5;
    protected boolean bladeSpinning;
    public DrivableLawnMower (FuelType fuelType, int fillingLevel) {
        super(fuelType,TransportType.CAR,fillingLevel);
        this.bladeSpinning = false;
    }
    public boolean isBladeSpinning(){
        return this.bladeSpinning;
    }
    public void spinBlade(){
        if(motorRunning){
            this.bladeSpinning = true;
        }
    }
    public void stopBlade(){
        this.bladeSpinning = false;
    }
    @Override
    public double letMeMove(int distance){
        if(!this.motorRunning){
            return 0;
        }
        int fillingLevel = this.getFillingLevel();
        double fuelNeed = distance*(BASE_CONSUMPTION/1000);
        int fuelUsage = (int) fuelNeed;
        if (fuelUsage > fillingLevel){
            fuelUsage = fillingLevel;
            fuelNeed = fillingLevel;
        }
        this.fillingLevel -= fuelUsage;
        return fuelNeed;
    }
}
