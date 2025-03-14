public class AirFlowSensor extends ThresholdGasSensor {

    private final DigitalInput input;
    public AirFlowSensor(int threshold, DigitalInput input) {
        super(threshold, input);
        this.input=input;

    }

    @Override
    public boolean isCritical() {
        return input.read() > 100;
    }
}
