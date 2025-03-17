public class MethaneSafeEngine implements PumpEngine {

    private final GasSensor methaneSensor;
    private final PumpEngine pumpEngine;

    public MethaneSafeEngine(GasSensor methaneSensor, PumpEngine pumpEngine) {
        this.methaneSensor = methaneSensor;
        this.pumpEngine = pumpEngine;
    }

    public void on(Sump sump) {
        if (methaneSensor.isCritical()) {
            System.out.println("Critical methane level! Turning off the engine...");
            this.pumpEngine.off();
            return;
        }
        this.pumpEngine.on(sump);
    }


    public void off() {
        this.pumpEngine.off();
    }
}
