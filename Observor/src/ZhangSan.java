import java.util.ArrayList;
import java.util.List;

public class ZhangSan implements Debit{
    private List<Credit>  debitList=new ArrayList<>();
    private int state=0;//1表示有钱
    @Override
    public void borrow(Credit credit) {
        debitList.add(credit);
    }
    @Override
    public void notifyCredit() {
        debitList.forEach(Credit::takeMoney);
    }
}
