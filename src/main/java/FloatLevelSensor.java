public class FloatLevelSensor implements Sensor{

    private final int levelThreshold;
    private final Environment environment;

    public FloatLevelSensor(int levelThreshold, Environment environment) {

        this.levelThreshold = levelThreshold;
        this.environment = environment;
    }

    @Override
    public boolean isOn() {
        int level = environment.liquidLevel();
        if (level >= levelThreshold) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public int sense() {
        return environment.liquidLevel();
    }
}
