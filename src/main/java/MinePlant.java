public class MinePlant implements Plant {

    private final SumpPump sumpPump;
    private final GasMonitor gasAlarm;


    public MinePlant(GasMonitor gasAlarm, SumpPump sumpPump) {

        this.sumpPump = sumpPump;
        this.gasAlarm = gasAlarm;

    }

    @Override
    public void run(Sump sump) {


            sumpPump.drain(sump);
            gasAlarm.watch();

    }
}
