public class Main {
    public static void main(String[] args) {
        Debit zhangsan=new ZhangSan();
        zhangsan.borrow(new ZhaoSi());
        zhangsan.borrow(new WangWu());
        zhangsan.notifyCredit();
    }
}

