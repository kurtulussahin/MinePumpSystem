public class CoalMine implements Mine {

    private final Plant minePlant;
    private final Sump sump;

    public CoalMine(Plant minePlant, Sump sump) {
        this.minePlant = minePlant;
        this.sump = sump;
    }

    @Override
    public void operate() {
        int count = 0;
        while (count < 100) {
            System.out.println("Döngü " + (count + 1) + "->");

            sump.live(5);
            minePlant.run(sump);

            count++;
        }

    }


}
