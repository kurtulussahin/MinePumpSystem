import java.util.Random;

public class CoalMineEnvironment implements Environment{

public CoalMineEnvironment(){
}
    
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

    @Override
    public int methane() {
        return new Random().nextInt(100);
    }

    @Override
    public int co() {
        return new Random().nextInt(100);
    }

    @Override
    public int liquidLevel() {
        return level;
    }

}
