public class LoggingCOSensor implements GasSensor, Sensor{

    private final COSensor coSensor;

    public LoggingCOSensor(COSensor coSensor){
        this.coSensor=coSensor;
    }
    @Override
    public boolean isCritical() {
        return this.isCritical();
    }

    @Override
    public boolean isOn() {
        return this.isOn();
    }

    @Override
    public int sense() {
        //TODO data log
        return this.sense();
    }
}
