import java.util.List;

public class MinePumpSystemTest {

    public static void main(String[] args) {

        Environment coalMineEnvironment = new CoalMineEnvironment();

        new CoalMine(
                new MinePlant(
                        new GasAlarm(
                                new Siren(new DigitalOutput("Gas Alarm")),
                                List.of(
                                        new AirFlowSensor(10, new BasicDigitalInput(new FakeGasInput())),
                                        new MethaneSensor(60, coalMineEnvironment),
                                        new COSensor(80, coalMineEnvironment)
                                )),
                        new SumpPump(
                                new MethaneSafeEngine(
                                        new MethaneSensor(60, coalMineEnvironment), new LoggingEngine(
                                        new PumpEngine(coalMineEnvironment))),
                                new LevelSumpProbe(
                                        new BasicSumpProbe(
                                                new LevelSensor(10, coalMineEnvironment),
                                                new LevelSensor(90, coalMineEnvironment)
                                        ), new LoggingFloatLevelSensor(new FloatLevelSensor(0, coalMineEnvironment)))
                        )
                ), coalMineEnvironment
        ).operate();


    }
}
