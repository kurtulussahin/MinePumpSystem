public class GasAlarm  {

    private final Alarm gasAlarm;
    private final GasSensor gasSensor;

    public GasAlarm(Alarm alarm, GasSensor gasSensor) {

        this.gasAlarm = alarm;
        this.gasSensor = gasSensor;

    }

    public void watch() {

        if (gasSensor.isCritical()) {
            gasAlarm.on();
        } else {
            gasAlarm.off();
        }
    }
}
