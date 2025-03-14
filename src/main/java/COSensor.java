public class COSensor extends ThresholdGasSensor {

    private final DigitalInput input;
    public COSensor(int threshold, DigitalInput input) {
        super(threshold, input);
        this.input=input;

    }

    @Override
    public boolean isCritical() {
        return input.read() > 100;
    }
}
