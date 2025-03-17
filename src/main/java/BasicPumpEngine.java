public class BasicPumpEngine implements PumpEngine {

    private final boolean[] isRunning=new boolean[1];
    private final DigitalOutput digitalOutput;

    public BasicPumpEngine(DigitalOutput digitalOutput) {

        this.digitalOutput = digitalOutput;
    }

    public void on() {

        if (!isRunning[0]) {
            isRunning[0] = true;
            digitalOutput.write("Pump Engine is running");
        } else {
            digitalOutput.write("Pump Engine is already running");
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
