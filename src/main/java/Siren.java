public class Siren implements Alarm {

    private final Output digitalOutput;

    public Siren(Output digitalOutput) {
        this.digitalOutput = digitalOutput;
    }

    @Override
    public void on() {
        digitalOutput.write("Alarm is on");
    }

    @Override
    public void off() {
        digitalOutput.write("Alarm is off");
    }
}
