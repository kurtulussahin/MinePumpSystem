import java.util.List;

public class GasAlarm implements GasMonitor {

    private final Siren gasAlarm;
    private final List<GasSensor> gasSensors;

    public GasAlarm(Siren alarm, List<GasSensor> gasSensors) {

        this.gasAlarm = alarm;
        this.gasSensors = gasSensors;
    }

    @Override
    public void watch() {
        boolean isCritical = false;
        for (GasSensor gasSensor: gasSensors) {
            if (gasSensor.isCritical()) {
                isCritical = true;
            }
        }
        if (isCritical) {
            gasAlarm.on();
        } else {
            gasAlarm.off();
        }
    }
}
