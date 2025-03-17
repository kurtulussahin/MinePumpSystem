public class Sump implements Environment{

    private int level =0;

    public void live(int rate) {

        level = level + rate;

    }
    public void drain(int rate) {
        level = level - rate;
    }
    public int value() {
       return level;
    }

}
