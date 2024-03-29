package trafficlights;

public class Timer {

    private int time;
    private boolean isInfinite;

    public Timer() {
        time = -1;
        isInfinite = false;
    }

    public int getTime() {
        return time;
    }

    public boolean isInfinite() {
        return isInfinite;
    }

    public void setTime(int waitTime) {
        this.time = waitTime;
        isInfinite = waitTime > 100;
    }
}
