package by.it.Java2.Lesson4.Task2;

public class CashMachine {

    private int banknote20;
    private int banknote50;
    private int banknote100;

    private int moneyInCashMachine;

    public CashMachine(int banknote20, int banknote50, int banknote100) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
        this.moneyInCashMachine = this.banknote20 * 20 + this.banknote50 * 50 + this.banknote100 * 100;
    }


    public boolean getMoney(int cash) {
        if (moneyInCashMachine >= cash) {
            moneyInCashMachine -= cash;
            printCheck(cash);
            return true;
        } else {
            return false;
        }
    }

    private void printCheck(int cash) {
        int first = cash / 100;
        System.out.println("Выдано " + first + " банкноты номиналом 100");  // думать метод
    }


    @Override
    public String toString() {
        return "CashMachine{" +
                "banknote20=" + banknote20 +
                ", banknote50=" + banknote50 +
                ", banknote100=" + banknote100 +
                ", moneyInCahMachine=" + moneyInCashMachine +
                '}';
    }
}
