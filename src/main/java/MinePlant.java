public class MinePlant {

    private final SumpPump sumpPump;

    public MinePlant(SumpPump sumpPump) {

        this.sumpPump = sumpPump;
    }
    public void run() {
        sumpPump.drain();
    }
}
