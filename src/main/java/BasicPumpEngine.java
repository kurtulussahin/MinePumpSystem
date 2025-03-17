public class BasicPumpEngine implements PumpEngine {

    private final boolean[] isRunning=new boolean[1];
    private final DigitalOutput digitalOutput;
    private final int drainRate = 10;
    private final Environment environment;

    public BasicPumpEngine(DigitalOutput digitalOutput, Environment environment) {

        this.digitalOutput = digitalOutput;
        this.environment = environment;
    }

    public void on() {

        if (!isRunning[0]) {
            isRunning[0] = true;
            digitalOutput.write("Pump Engine is running");
            environment.drain(drainRate);
        } else {
            digitalOutput.write("Pump Engine is already running");
            environment.drain(drainRate);
        }
    }

    public void off() {

        if (isRunning[0]) {
            isRunning[0] = false;
            digitalOutput.write("Pump Engine is closing");
        } else {
            digitalOutput.write("Pump Engine is already closed");
        }
    }
}
