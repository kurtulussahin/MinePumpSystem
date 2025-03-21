public class LoggingFloatLevelSensor implements Sensor{

    private final Sensor sensor;

    public LoggingFloatLevelSensor(FloatLevelSensor sensor){
        this.sensor=sensor;
    }

    @Override
    public boolean isOn() {
        return this.sensor.isOn();
    }

    @Override
    public int sense() {
        int value=this.sensor.sense();
        new FloatLevelSensorData(value);
        return value;
    }
}
