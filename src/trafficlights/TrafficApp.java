package trafficlights;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrafficApp {
    public static void main(String[] args) throws IOException {
        final InputCar inputCar = new InputCar();
        final InputTimerElapsed timerElapsed = new InputTimerElapsed();
        final TrafficLights trafficLights = new TrafficLights();
        final Timer timer = trafficLights.getTimer();
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            long initialTime = System.currentTimeMillis();
            long actualTime = initialTime;
            boolean infiniteExit = true;
            int time = timer.getTime();
            while ((actualTime - initialTime) <= time * 1000 && infiniteExit) {
                long l = actualTime - initialTime;
                if (l%1000 == 0 && time < 100){
                    System.out.print("\r" + (time - (l/1000)));
                }
                if (System.in.available() > 0) {
                    String i = reader.readLine();
                    if (!i.equals("")) {
                        int i2;
                        try {
                            i2 = Integer.parseInt(i);
                        } catch (NumberFormatException e) {
                            i2 = -1;
                        }
                        switch (i2) {
                            case 1:
                                try {
                                    infiniteExit = !timer.isInfinite();
                                    System.out.println("\n" + trafficLights.newEvent(inputCar).print());
                                    break;
                                }catch (UnsupportedOperationException e){
                                    System.out.println("STOP THERE EDWARD!!! \n");
                                    break;
                                }
                            case 2:
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Bad symbol... try again");
                                break;
                        }
                    }
                }
                actualTime = System.currentTimeMillis();
            }
            if (infiniteExit) {
                System.out.println("\n" + trafficLights.newEvent(timerElapsed).print());
            }
        }
    }
}
