public class BasicDigitalInput implements DigitalInput {

    private final Input input;

    BasicDigitalInput(Input input) {
        this.input = input;
    }
    BasicDigitalInput() {
        this.input =new WaterInput();
    }

    @Override
    public int read(Environment environment) {
        return environment.level();
    }

    @Override
    public int read() {
        return input.value();
    }

}
