public abstract class Cooker {
    Cooker (){
    }
    abstract void step1();
    abstract void step2();
    void cook(){
        System.out.println("开始炒菜");
        step1();
        step2();
        System.out.println("完成菜肴");
    }
}
