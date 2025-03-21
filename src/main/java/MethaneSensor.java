public class MethaneSensor implements GasSensor {


    private final Environment environment;
    private final int threshold;
    private final Output digitalOutput;

    public MethaneSensor(int threshold, Environment environment) {
        this.environment=environment;
        this.threshold = threshold;
        this.digitalOutput = new DigitalOutput("Methane Sensor");

    }

    @Override
    public boolean isCritical() {
        int level = environment.methane();
        new MethaneLevelData(level);
        digitalOutput.write("The level is " + level);
        return level > threshold;

    }

}
