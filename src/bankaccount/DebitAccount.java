package bankaccount;

public class DebitAccount extends BankAccount {
    public DebitAccount(int amount, String currency) {
        if (amount < 0) {
            System.out.println("Баланс дебетового счета не может быть меньше 0");
        } else {
            this.amount = amount;
            this.currency = currency;
        }
    }

    public void withdrawCash(int amount) {
        if (this.amount >= amount) {
            this.amount -= amount;
            System.out.println(String.format("Вы сняли %d %s", amount, currency));
        } else {
            System.out.println(String.format("У вас недостаточно средств для снятия суммы %d %s", amount, currency));
        }
    }

    public void showBalance() {
        System.out.println(String.format("На вашем счету осталось %d %s", amount, currency));
    }
}