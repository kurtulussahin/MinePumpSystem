import java.util.List;

public class MinePumpSystemTest {

    public static void main(String[] args) {

        Environment sump = new Sump();

        new CoalMine(
                new MinePlant(
                        new GasAlarm(
                                new Siren(new DigitalOutput("Gas Alarm")),
                                List.of(
                                        new AirFlowSensor(10, new BasicDigitalInput(new FakeGasInput())),
                                        new MethaneSensor(60, sump),
                                        new COSensor(80, new BasicDigitalInput(new FakeGasInput()))
                                )),
                        new SumpPump(
                                new MethaneSafeEngine(
                                        new MethaneSensor(60, sump), new LoggingEngine(
                                        new PumpEngine(sump))),
                                new LevelSumpProbe(
                                        new BasicSumpProbe(
                                                new LevelSensor("Min Water Level Sensor", 10, sump),
                                                new LevelSensor("Max Water Level Sensor", 90, sump)
                                        ), new LoggingFloatLevelSensor(new FloatLevelSensor(0, sump)))
                        )
                ), sump
        ).operate();


    }
}
