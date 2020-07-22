public interface IBankAccountController {
    public void withdraw(String accountNumber, BigDecimal amount);
    public void deposit(String accountNumber, BigDecimal amount);
}
