public class BasicDigitalInput implements DigitalInput {

    private final Environment environment;

    BasicDigitalInput(Environment environment) {
        this.environment =environment;
    }

    @Override
    public int read(Environment environment) {
        return environment.value();
    }

    @Override
    public int read() {
        return environment.value();
    }

}
