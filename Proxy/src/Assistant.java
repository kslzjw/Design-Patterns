public class Assistant implements Service{
    Host host;
    Assistant(Host host){
        this.host=host;
    }
    void info(){
    }
    void log(){
    }
    @Override
    public void doSomething() {
        info();
        host.doSomething();
        log();
    }
}
