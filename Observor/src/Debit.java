public interface Debit {
    void borrow(Credit credit);
    void notifyCredit();
}
