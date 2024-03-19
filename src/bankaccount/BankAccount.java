package bankaccount;

public class BankAccount {
    int amount;
    String currency;

    public void replenishBalance(int amount) {
        this.amount += amount;
        System.out.println(String.format("Счёт пополнен на %d %s", amount, currency));
    }

    public void withdrawCash(int amount) { }

    public void showBalance() { }
}
