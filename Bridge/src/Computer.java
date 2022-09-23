public abstract class Computer {
   protected Brand brand;
    Computer(Brand brand){
        this.brand=brand;
    }
    void info(){
        brand.info();
    }
}
