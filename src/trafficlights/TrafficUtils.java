package trafficlights;


public class TrafficUtils {
    private TrafficState[] states;
    private TrafficDelta delta;
    private Timer timer;

    public TrafficUtils() {
        states = createStates();
        delta = createDelta(this);
        timer = new Timer();
    }

    private TrafficState[] createStates() {
        return new TrafficState[]{new EWGo(), new EWGoR(), new EWGoC(), new EWStop(),new NSGo(), new NSGoR(), new NSGoC(), new NSStop()};
    }

    private TrafficDelta createDelta(TrafficUtils trafficUtils) {
        return new TrafficDelta(trafficUtils);
    }

    public TrafficState[] getStates() {
        return states;
    }

    public TrafficDelta getDelta() {
        return delta;
    }

    public Timer getTimer() {
        return timer;
    }
}
