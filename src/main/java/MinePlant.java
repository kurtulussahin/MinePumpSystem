public class MinePlant {

    private final SumpPump sumpPump;
    private final GasAlarm gasAlarm;

    public MinePlant(GasAlarm gasAlarm, SumpPump sumpPump) {

        this.sumpPump = sumpPump;
        this.gasAlarm = gasAlarm;
    }

    public void run() {
        sumpPump.drain();
        gasAlarm.watch();
    }
}
