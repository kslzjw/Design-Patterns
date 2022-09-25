public class Mentor extends Handler{

    @Override
    public void process(Integer info) {
        if(info>0&&info<11) System.out.println("Mentor处理");
        else{
              nextHandler.process(info);
        }
    }

}
