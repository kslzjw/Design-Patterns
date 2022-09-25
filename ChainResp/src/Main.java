public class Main {
    public static void main(String[] args) {
        Handler level1=new Mentor();
        Handler level2=new Leader();
        level1.setNextHandler(level2);
        level1.process(2);
        level1.process(14);
    }
}
