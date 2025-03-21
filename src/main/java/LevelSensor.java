public class LevelSensor implements Sensor {

    private final int levelThreshold;
    private final Environment environment;

    public LevelSensor(int levelThreshold, Environment environment) {

        this.levelThreshold = levelThreshold;
        this.environment = environment;
    }

    @Override
    public boolean isOn() {

        int level = environment.value();
        if (level >= levelThreshold) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public int sense() {
        if(isOn()) {
            return levelThreshold;
        }else{
            return 0;
        }
    }
}
