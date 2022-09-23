public class Laptop extends Computer {
    Laptop(Brand brand) {
        super(brand);
    }

    @Override
    void info() {
        super.info();
        System.out.println("笔记本！");
    }
}
