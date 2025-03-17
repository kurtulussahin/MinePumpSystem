public class BasicSumpProbe implements SumpProbe {

    private final LevelSensor minLevelSensor;
    private final LevelSensor maxLevelSensor;
    private final boolean[] mustDrain=new boolean[1];
    private final DigitalOutput digitalOutput;

    public BasicSumpProbe(LevelSensor minLevelSensor, LevelSensor maxLevelSensor) {

        this.minLevelSensor = minLevelSensor;
        this.maxLevelSensor = maxLevelSensor;
        this.digitalOutput = new DigitalOutput("Sump Probe");
    }

    @Override
    public boolean mustDrain(Sump sump) {

        if (maxLevelSensor.isOn(sump)) {
            digitalOutput.write("💧 Su seviyesi yüksek!");
            mustDrain[0]=true;
        } else if (minLevelSensor.isOn(sump)) {
            digitalOutput.write("💧 Su seviyesi takip seviyesinde!");
        } else {
            digitalOutput.write("💧 Su seviyesi güvenli!");
            mustDrain[0]=false;
        }
        return mustDrain[0];
    }
}
