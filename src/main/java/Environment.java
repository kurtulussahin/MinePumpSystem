public interface Environment {

    void live(int rate);
    void drain(int rate);
    int level();

}
