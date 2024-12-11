public class Payment1 {
    private double balance;

    public Payment1(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void addMoney(double increase) {
        this.balance = this.balance + increase;
    }

    public boolean takeMoney(double amount) {
        if (this.balance >= amount) {
        this.balance = this.balance - amount;
            return true;
        }

        return false;

    }

}





