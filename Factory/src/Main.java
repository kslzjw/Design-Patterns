public class Main {
    public static void main(String[] args) {
        //只传入自己的要求，由工厂来创建需要的类，不关注细节
        Computer computer = new ShopAssistant().suggest("mac");
        System.out.println(computer.describe());
    }
}
