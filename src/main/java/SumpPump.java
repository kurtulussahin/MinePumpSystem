public class SumpPump implements Pump {

    private final Engine engine;
    private final SumpProbe sumpProbe;


    public SumpPump(Engine engine, SumpProbe sumpProbe) {

        this.engine = engine;
        this.sumpProbe = sumpProbe;

    }

    @Override
    public void drain() {

        if (sumpProbe.mustDrain()) {
            engine.on();
        } else {
            engine.off();
        }
    }
}
