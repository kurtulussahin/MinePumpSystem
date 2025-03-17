public class MinePlant implements Plant {

    private final SumpPump sumpPump;
    private final GasMonitor gasAlarm;


    public MinePlant(GasMonitor gasAlarm, SumpPump sumpPump) {

        this.sumpPump = sumpPump;
        this.gasAlarm = gasAlarm;

    }

    @Override
    public void run() {

        int count = 0;
        while (count < 100) {
            System.out.println("Döngü " + (count + 1) + "->");
            sumpPump.drain();
            gasAlarm.watch();
            count++;
        }

    }
}
