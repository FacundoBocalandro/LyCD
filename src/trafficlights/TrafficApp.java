package trafficlights;

import fst.Output;

import java.util.Scanner;

public class TrafficApp {
    public static void main(String[] args) {
        final InputCar inputCar = new InputCar();
        final InputTimerElapsed timerElapsed = new InputTimerElapsed();
        final TrafficLights trafficLights = new TrafficLights();
        final Timer timer = trafficLights.getTimer();
        final Scanner scanner = new Scanner(System.in);
        while (true){
            long initialTime = System.currentTimeMillis();
            boolean infiniteExit = true;
            int time = timer.getTime();
            while(System.currentTimeMillis() - initialTime <= time*1000 && infiniteExit){
                if (scanner.hasNext()){
                    String i = scanner.next();
                    int i2;
                    try {
                        i2 = Integer.parseInt(i);
                    }catch (NumberFormatException e){
                        i2 = -1;
                    }
                    switch (i2){
                        case 1:
                            infiniteExit = !timer.isInfinite();
                            System.out.println(trafficLights.newEvent(inputCar).print());
                            break;
                        case 2:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Bad symbol... try again");
                            break;
                    }
                }
            }
            if (infiniteExit) {
                System.out.println(trafficLights.newEvent(timerElapsed).print());
            }
        }
    }
}
