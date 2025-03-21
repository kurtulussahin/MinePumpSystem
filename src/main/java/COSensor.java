public class COSensor implements GasSensor, Sensor {

    private final Environment environment;
    private final int threshold;

    public COSensor(int threshold, Environment environment) {
        this.environment=environment;
        this.threshold = threshold;
    }

    @Override
    public boolean isCritical() {
        int level = environment.co();
        return level > threshold;

    }

    @Override
    public boolean isOn() {
        return threshold>environment.co();
    }

    @Override
    public int sense() {
        return environment.co();
    }
}
