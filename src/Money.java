public class Money {
    private final int euros;
    private final int cents;


    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money addition) {
        int euros = this.euros() + addition.euros();
        int cents = this.cents() + addition.cents();
        Money newMoney = new Money(euros, cents); // create a new Money object that has the correct worth
        return newMoney;
    }


    public boolean lessThan(Money compared) {
        if (this.euros() <= compared.euros() && this.cents() <= compared.cents()) {
            return true;
        }
        return false;

    }

    public Money minus(Money decreaser) {
        // Convert both amounts to total cents
        int totalCents1 = this.euros * 100 + this.cents;
        int totalCents2 = decreaser.euros * 100 + decreaser.cents;

        // Subtract the total cents
        int differenceInCents = totalCents1 - totalCents2;

        // Ensure the result isn't negative
        if (differenceInCents < 0) {
            differenceInCents = 0;
        }

        // Convert back to euros and cents
        int resultEuros = differenceInCents / 100; // Division to get euros
        int resultCents = differenceInCents % 100; // Modulus to get remaining cents

        // Return a new Money object with the result
        return new Money(resultEuros, resultCents);
    }
}













