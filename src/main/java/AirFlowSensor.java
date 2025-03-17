public class AirFlowSensor implements GasSensor {

    private final DigitalInput digitalInput;
    private final int threshold;
    private final DigitalOutput digitalOutput;

    public AirFlowSensor(int threshold, DigitalInput digitalInput) {
        this.digitalInput=digitalInput;
        this.threshold = threshold;
        this.digitalOutput = new DigitalOutput("Air Flow Sensor");

    }

    @Override
    public boolean isCritical() {
        int level = digitalInput.read();
        digitalOutput.write("The level is " + level);
        return level < threshold;

    }
}
