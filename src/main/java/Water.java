public class Water implements Liquid {

    private int level;

    @Override
    public void fill() {
        level=level+1;
    }
}
