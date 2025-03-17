import java.util.List;

public class MinePumpSystemTest {

    public static void main(String[] args) {

        Input fakeWaterInput = new FakeWaterInput();
        int count=0;
        while (count<100) {
            System.out.println("Döngü " + (count + 1) + "->");

            new MinePlant(
                    new GasAlarm(
                            new Siren(new DigitalOutput("Gas Alarm")),
                            List.of(
                                    new AirFlowSensor(5,new BasicDigitalInput(new FakeGasInput())),
                                    new MethaneSensor(90,new BasicDigitalInput(new FakeGasInput())),
                                    new COSensor(95,new BasicDigitalInput(new FakeGasInput()))
                            )),
                    new SumpPump(
                            new MethaneSafeEngine(
                                    new MethaneSensor(90,
                                            new BasicDigitalInput(
                                                    new FakeGasInput())),
                                    new BasicPumpEngine(new DigitalOutput("Engine"))),
                            new BasicSumpProbe(
                                    new LevelSensor("Min Water Level Sensor",80,new BasicDigitalInput(fakeWaterInput)),
                                    new LevelSensor("Max Water Level Sensor",90,new BasicDigitalInput(fakeWaterInput))
                            )
                    )
            ).run();

            count++;
        }
    }
}