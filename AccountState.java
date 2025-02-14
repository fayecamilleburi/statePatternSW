public interface AccountState {
    public void deposit(Account account, double depositAmount);
    public void withdraw(Account account, double withdrawAmount);
    public void activate(Account account);
    public void suspend(Account account);
    public void close(Account account);
}