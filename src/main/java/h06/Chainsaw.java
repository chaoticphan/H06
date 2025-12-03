package h06;

import org.tudalgo.algoutils.student.annotation.DoNotTouch;
import org.tudalgo.algoutils.student.annotation.StudentImplementationRequired;

/**
 * A fuel powered chainsaw
 */
public class Chainsaw implements FuelPowered {

    @DoNotTouch
    private boolean motorRunning;
    @DoNotTouch
    private int attempts;
    @DoNotTouch
    private Wood[] remainingWood;


    /**
     * Creates a new Chainsaw
     */
    @DoNotTouch
    public Chainsaw() {
        this.motorRunning = false;
        this.attempts = 0;
        this.remainingWood = new Wood[0];
    }

    /**
     * attempts to start the chainsaw.
     * guaranteed to succeed after 3 attempts.
     */
    @DoNotTouch
    public void attemptStart() {
        if (motorRunning) {
            return;
        }
        if (attempts >= 3 || Math.random() > 0.5) {
            motorRunning = true;
        }
        attempts += 1;
    }

    /**
     * stops the chainsaw
     */
    @DoNotTouch
    public void stopMotor() {
        motorRunning = false;
        attempts = 0;
    }

    /**
     * checks is the motor is running
     *
     * @return true if the motor is running
     */
    @DoNotTouch
    public boolean isMotorRunning() {
        return motorRunning;
    }

    /**
     * adds wood to be sawed by the chainsaw
     *
     * @param wood the piece of wood to be added
     */
    @DoNotTouch
    public void addWood(Wood wood) {
        Wood[] newWood = new Wood[remainingWood.length + 1];
        for (int i = 0; i < remainingWood.length; i++) {
            newWood[i] = remainingWood[i];
        }
        newWood[newWood.length - 1] = wood;
        remainingWood = newWood;
    }

    /**
     * saws the oldest remaining piece of wood
     *
     * @param duration the duration to be sawed
     */
    @StudentImplementationRequired("H6.4.1")
    public void sawWood(int duration) {
        // TODO H6.4.1
        if(getRemainingWood() ==0 || !isMotorRunning()) {return;}
        Wood currWood = remainingWood[0];
        double cutting  = duration/currWood.strength;
        if (cutting>=currWood.cuttingDepth) {
           Wood[] newWood = new Wood[remainingWood.length -1];
           for(int i=1; i<remainingWood.length; i++){
               newWood[i-1] = remainingWood[i];
           }
           remainingWood = newWood;
        }else{
            currWood.cuttingDepth-=cutting;
        }
    }

    /**
     * @return the number of remaining wood logs to be sawed
     */
    @DoNotTouch
    public int getRemainingWood() {
        return remainingWood.length;
    }

    @Override
    public FuelType getFuelType() {
        return FuelType.GASOLINE;
    }
}
