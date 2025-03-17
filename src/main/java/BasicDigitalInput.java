public class BasicDigitalInput implements DigitalInput {

    private final Input input;

    BasicDigitalInput(Input input) {
        this.input = input;
    }

    @Override
    public int read() {
        return input.value();
    }
}
