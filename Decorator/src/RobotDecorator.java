public class RobotDecorator implements Robot{
    Robot robot;
    RobotDecorator(Robot robot){
        this.robot=robot;
    }
    @Override
    public void info() {
        robot.info();
        System.out.println("修饰器包装之后添加的新功能");
    }
}
