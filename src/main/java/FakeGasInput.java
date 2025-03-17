import java.util.Random;

public class FakeGasInput implements Environment {

    private int value;

    @Override
    public void live(int rate) {

    }

    @Override
    public void drain(int rate) {

    }

    @Override
    public int value(){

        int value= new Random().nextInt(100);
        return value;
    }
}
