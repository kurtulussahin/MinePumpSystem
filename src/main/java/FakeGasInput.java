import java.util.Random;

public class FakeGasInput implements Input {

    private int value;

    @Override
    public int value(){

        int value= new Random().nextInt(100);
        return value;
    }
}
