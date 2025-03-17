public class LevelSensor implements Sensor {

    private final int levelThreshold;
    private final DigitalInput digitalInput;
    private final String name;
    private final Output digitalOutput;

    public LevelSensor(String name, int levelThreshold, DigitalInput digitalInput) {

        this.levelThreshold = levelThreshold;
        this.digitalInput = digitalInput;
        this.name = name;
        this.digitalOutput = new DigitalOutput(this.name);
    }

    @Override
    public boolean isOn() {

        int level = digitalInput.read();
        if (level >= levelThreshold) {
            digitalOutput.write("On" + " | Level: " + level);
            return true;
        }else {
            digitalOutput.write("Off"+" | Level: " + level);
            return false;
        }
    }
}
