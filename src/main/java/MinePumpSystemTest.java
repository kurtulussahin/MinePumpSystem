import java.nio.file.Watchable;
import java.util.List;

public class MinePumpSystemTest {

    public static void main(String[] args) {


        new CoalMine(
                new MinePlant(
                        new GasAlarm(
                                new Siren(new DigitalOutput("Gas Alarm")),
                                List.of(
                                        new AirFlowSensor(10, new BasicDigitalInput(new FakeGasInput())),
                                        new MethaneSensor(80, new BasicDigitalInput(new FakeGasInput())),
                                        new COSensor(80, new BasicDigitalInput(new FakeGasInput()))
                                )),
                        new SumpPump(
                                new MethaneSafeEngine(
                                        new MethaneSensor(90,
                                                new BasicDigitalInput(
                                                        new FakeGasInput())),
                                        new BasicPumpEngine(new DigitalOutput("Engine"))),
                                new BasicSumpProbe(
                                        new LevelSensor("Min Water Level Sensor", 40, new BasicDigitalInput()),
                                        new LevelSensor("Max Water Level Sensor", 90, new BasicDigitalInput())
                                )
                        )
                ),
                new Sump()
        ).operate();


    }
}
