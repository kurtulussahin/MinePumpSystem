public class SumpPump implements Pump {

    private final PumpEngine pumpEngine;
    private final SumpProbe sumpProbe;


    public SumpPump(PumpEngine pumpEngine, SumpProbe sumpProbe) {

        this.pumpEngine = pumpEngine;
        this.sumpProbe = sumpProbe;

    }

    @Override
    public void drain(Sump sump) {

        if (sumpProbe.mustDrain(sump)) {
            pumpEngine.on(sump);
        } else {
            pumpEngine.off();
        }
    }
}
