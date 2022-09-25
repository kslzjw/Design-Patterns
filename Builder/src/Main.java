public class Main {
    public static void main(String[] args) {
        Computer computer=new Computer.Builder("xxx","yy").setDisplay("samuage").build();
        computer.sendMessage();
    }
}
