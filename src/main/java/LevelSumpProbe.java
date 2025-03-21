public class LevelSumpProbe implements SumpProbe {

    private final BasicSumpProbe sumpProbe;
    private final Sensor levelSensor;

    public LevelSumpProbe(BasicSumpProbe sumpProbe, Sensor levelSensor){
        this.sumpProbe=sumpProbe;
        this.levelSensor=levelSensor;
    }

    @Override
    public boolean mustDrain() {
        levelSensor.sense();
        return sumpProbe.mustDrain();

    }
}
