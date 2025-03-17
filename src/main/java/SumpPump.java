public class SumpPump implements Pump {

    private final PumpEngine pumpEngine;
    private final SumpProbe sumpProbe;


    public SumpPump(PumpEngine pumpEngine, SumpProbe sumpProbe) {

        this.pumpEngine = pumpEngine;
        this.sumpProbe = sumpProbe;

    }

    @Override
    public void drain() {

        if (sumpProbe.mustDrain()) {
            pumpEngine.on();
        } else {
            pumpEngine.off();
        }
    }
}
