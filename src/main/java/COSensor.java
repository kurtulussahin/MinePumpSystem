public class COSensor implements GasSensor {

    private final DigitalInput digitalInput;
    private final int threshold;
    private final Output digitalOutput;

    public COSensor(int threshold, DigitalInput digitalInput) {
        this.digitalInput=digitalInput;
        this.threshold = threshold;
        this.digitalOutput = new DigitalOutput("CO Sensor");

    }

    @Override
    public boolean isCritical() {
        int level = digitalInput.read();
        digitalOutput.write("The level is " + level);
        return level > threshold;

    }
}
