public class WaterInput implements Input,Liquid {

    private int value;

    @Override
    public int value(){

        return value;
    }

    @Override
    public void fill() {
        value = value + 10;
    }
}
