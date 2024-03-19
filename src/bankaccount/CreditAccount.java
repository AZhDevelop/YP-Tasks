package bankaccount;

public class CreditAccount extends BankAccount {
    private int creditLimit;

    public CreditAccount(int amount, String currency, int creditLimit) {
        this.amount = amount;
        this.currency = currency;
        this.creditLimit = creditLimit;
    }

    public void withdrawCash(int amount) {
        if ((this.amount - amount) >= (creditLimit * (-1)))  {
            this.amount -= amount;
            System.out.println(String.format("Вы сняли %d %s", amount, currency));
        } else {
            System.out.println(String.format("У вас недостаточно средств для снятия суммы %d %s", amount, currency));
        }
    }

    public void showBalance() {
        if (amount >= 0 ) {
            System.out.println(String.format("На вашем счету осталось %d %s", amount, currency));
        } else {
            System.out.println(String.format("Задолженность по кредитному счёту составляет %d %s", amount * (-1), currency));
        }
    }

}
