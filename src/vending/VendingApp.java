package vending;

import fst.Output;

import java.util.Scanner;

public class VendingApp {
    public static void main(String[] args) throws InterruptedException {
        final Input1 input1 = new Input1();
        final Input2 input2 = new Input2();
        final InputButton inputButton = new InputButton();
        final InputStock inputStock = new InputStock();
        final VendingMachine vendingMachine = new VendingMachine();
        printOptions();
        System.out.println("\nInsert capsule and cup");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String i = scanner.next();
            VendingInput input = null;
            int i2;
            try {
                i2 = Integer.parseInt(i);
            }catch (NumberFormatException e){
                i2 = -1;
            }
            switch (i2){
                case 1:
                    input = input1;
                    break;
                case 2:
                    input = input2;
                    break;
                case 3:
                    input = inputButton;
                    break;
                case 4:
                    input = inputStock;
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Bad symbol... try again");
                    break;
            }
            if (input != null) {
                try {
                    Output output = vendingMachine.newEvent(input);
                    System.out.println(output.print());
                    int waitTime = output.getWaitTime();
                    if (waitTime != 0) {
                        progress(waitTime * 1000);
                    }

                }catch (UnsupportedOperationException e){
                    System.out.println("Stop there Edward!");
                }
            }
        }
    }

    private static void progress(long millis) throws InterruptedException {
        long wait = millis/20;
        int i = 0;
        while(i < 21) {
            System.out.print("[");
            for (int j=0;j<i;j++) {
                System.out.print("=");
            }

            for (int j=0;j<20-i;j++) {
                System.out.print(" ");
            }

            System.out.print("] "+  i*5 + "%");
            if(i<20) {
                System.out.print("\r");
                Thread.sleep(wait);
            }
            i++;
        }
        System.out.println("\nEnjoy your coffee");
        System.out.println("\nInsert capsule and cup");
    }

    private static void printOptions() {
        System.out.println("Options:\n" +
                "1: Insert $1 coin\n" +
                "2: Insert $2 coin\n" +
                "3: Press button\n" +
                "4: Insert capsule and cup\n" +
                "5: Stop");
    }
}
