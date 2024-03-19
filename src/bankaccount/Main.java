package bankaccount;

public class Main {
    public static void main(String[] args) {
        DebitAccount debitAccount = new DebitAccount(1000, "USD");
        CreditAccount creditAccount = new CreditAccount(1000, "USD", 1000);

        System.out.println("*** Дебетовый счет ***");
        debitAccount.showBalance();
        debitAccount.withdrawCash(200);
        debitAccount.showBalance();
        debitAccount.replenishBalance(500);
        debitAccount.showBalance();

        System.out.println("\n*** Кредитный счет ***");
        creditAccount.showBalance();
        creditAccount.replenishBalance(500);
        creditAccount.showBalance();
        creditAccount.withdrawCash(800);
        creditAccount.showBalance();
        creditAccount.withdrawCash(800);
        creditAccount.showBalance();
        creditAccount.withdrawCash(800);
        creditAccount.showBalance();
        creditAccount.withdrawCash(800);
        creditAccount.showBalance();
        creditAccount.replenishBalance(500);
        creditAccount.showBalance();
    }
}
