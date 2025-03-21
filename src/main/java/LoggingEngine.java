public class LoggingEngine implements Engine{

    private final Engine engine;

    public LoggingEngine(Engine engine){
        this.engine=engine;
    }

    public void on(){
        this.engine.on();
        new EngineData(true);
    }

    public void off(){
        this.engine.off();
        new EngineData(false);
    }

}
