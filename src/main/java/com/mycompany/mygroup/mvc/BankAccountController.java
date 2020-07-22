public class BankAccountController implements IBankAccountController {
    private BankAccountBoundary bankAccountBoundary;
    public BankAccountController() {
        this.bankAccountBoundary = DependencyResolver.getBankAccountBoundary();
    }
    public void withdraw(String accountNumber, BigDecimal amount) {
    
    }
}
