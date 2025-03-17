public class DigitalOutput implements Output {

    private final String name;

    DigitalOutput(String name) {

        this.name = name;
    }

    @Override
    public void write(String value) {

       System.out.println(name +":"+ value);
    }
}
