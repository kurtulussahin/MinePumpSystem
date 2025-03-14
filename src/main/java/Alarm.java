public class Alarm {

    private final DigitalOutput digitalOutput;

    public Alarm(DigitalOutput digitalOutput) {
        this.digitalOutput = digitalOutput;
    }

    public void on() {
        digitalOutput.write("Alarm is on");
    }

    public void off() {
        digitalOutput.write("Alarm is off");
    }
}
