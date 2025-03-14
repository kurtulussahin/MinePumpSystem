public class ThresholdGasSensor implements GasSensor{

    private final int threshold;
    private final DigitalInput digitalInput;

    public ThresholdGasSensor(int threshold, DigitalInput digitalInput) {
        this.threshold = threshold;
        this.digitalInput = digitalInput;
    }
    @Override
    public boolean isCritical() {
        int level = digitalInput.read();

        if (level > threshold)
            return true;

        return false;
    }
}
