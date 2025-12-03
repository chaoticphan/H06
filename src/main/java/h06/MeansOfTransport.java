package h06;

public abstract class MeansOfTransport {
    protected final TransportType transportType;

    public MeansOfTransport(TransportType transportType) {
        this.transportType = transportType;
    }

    public TransportType getTransportType(){
        return transportType;
    };


    /**
     * Take the amount of distance travel and calculate the fuel usage for each vehicle
     *
     * @param distance the vehicle travel
     * @return fuel usage of the vehicle to travel the given distance
     */
    public abstract double letMeMove(int distance);
}
