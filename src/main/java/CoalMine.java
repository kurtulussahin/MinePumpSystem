import java.util.concurrent.TimeUnit;

public class CoalMine implements Mine {

    private final Plant minePlant;
    private final Environment sump;

    public CoalMine(Plant minePlant, Environment sump) {
        this.minePlant = minePlant;
        this.sump = sump;
    }

    @Override
    public void operate() {
        int count = 0;
        while (count < 100) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Döngü " + (count + 1) + "->");

            sump.live(5);
            minePlant.run();

            count++;
        }

    }


}
