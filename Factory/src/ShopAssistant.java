public class ShopAssistant {
    public Computer suggest(String request){
        Computer computer=null;
        if(request.equals("游戏本")){
            return new Desktop();
        }else if(request.equals("mac")){
            return new MacbookPro();
        }
        return computer;
    }
}
