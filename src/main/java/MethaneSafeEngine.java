public class MethaneSafeEngine implements Engine {

    private final GasSensor methaneSensor;
    private final Engine engine;

    public MethaneSafeEngine(GasSensor methaneSensor, Engine engine) {
        this.methaneSensor = methaneSensor;
        this.engine = engine;
    }

    public void on() {
        if (methaneSensor.isCritical()) {
            System.out.println("Critical methane level! Turning off the engine...");
            this.engine.off();
            return;
        }
        this.engine.on();
    }


    public void off() {
        this.engine.off();
    }
}
