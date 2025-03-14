package proceduralversion;

import static proceduralversion.PumpController.controlPump;

public class MinePumpSystemTest {

    public static void main(String[] args) {


        int count=0;
        while (count<100) {
            System.out.print("Döngü " + (count + 1) + "->");
            controlPump();
            count++;
        }
    }
}