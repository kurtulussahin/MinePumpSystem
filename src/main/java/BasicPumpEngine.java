public class BasicPumpEngine implements PumpEngine {

    private final boolean[] isRunning=new boolean[1];
    private final DigitalOutput digitalOutput;
    private final int drainRate = 10;

    public BasicPumpEngine(DigitalOutput digitalOutput) {

        this.digitalOutput = digitalOutput;
    }

    public void on(Sump sump) {

        if (!isRunning[0]) {
            isRunning[0] = true;
            digitalOutput.write("Pump Engine is running");
            sump.drain(drainRate);
        } else {
            digitalOutput.write("Pump Engine is already running");
            sump.drain(drainRate);
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
