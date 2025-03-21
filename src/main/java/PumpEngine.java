public class PumpEngine implements Engine {

    private final boolean[] isRunning = new boolean[1];
    private final int drainRate = 10;
    private final Environment environment;

    public PumpEngine(Environment environment) {

        this.environment = environment;
    }

    public void on() {

        isRunning[0] = true;
        environment.drain(drainRate);
    }

    public void off() {

        isRunning[0] = false;
    }
}
