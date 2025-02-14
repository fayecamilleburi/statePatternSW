public class ActiveState implements AccountState {
    @Override
    public void deposit(Account account, double depositAmount) {
        account.setBalance(account.getBalance() + depositAmount);
        System.out.println("Deposited " + depositAmount + ". New balance: " + account.getBalance());
        System.out.println(account.toString());
    }

    @Override
    public void withdraw(Account account, double withdrawAmount) {
        try {
            if (withdrawAmount > account.getBalance()) {
                throw new ArithmeticException("Insufficient balance for withdrawal.");
            }
            account.setBalance(account.getBalance() - withdrawAmount);
            System.out.println("Withdrew " + withdrawAmount + " from account " + account.getAccountNumber());
            System.out.println(account); // Calls toString() method
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println(account); // Calls toString() method
        }
    }

    @Override
    public void activate(Account account) {
        System.out.println("Account is already activated!");
    }

    @Override
    public void suspend(Account account) {
        account.setAccountState(new SuspendedState());
        System.out.println("Account is suspended!");
    }

    @Override
    public void close(Account account) {
        account.setAccountState(new ClosedState());
        System.out.println("Account is closed!");
    }
}