import javax.xml.crypto.dom.DOMCryptoContext;

public class PaymentTerminal {
        private double money;  // amount of cash
        private int affordableMeals; // number of sold affordable meals
        private int heartyMeals;  // number of sold hearty meals

        public PaymentTerminal() {
                this.money = 1000;
        }


        public double eatAffordably(double payment) {
            // an affordable meal costs 2.50 euros
            // increase the amount of cash by the price of an affordable meal and return the change
            // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
                double mealPrice = 2.50;

                if (payment >= mealPrice) {
                        affordableMeals++;
                        this.money += mealPrice;
                        return payment - mealPrice;
                }
                return payment;
        }

        public double eatHeartily(double payment) {
            // a hearty meal costs 4.30 euros
            // increase the amount of cash by the price of a hearty meal and return the change
            // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
                double mealPrice = 4.30;
                if (payment >= mealPrice) {
                        heartyMeals++;
                        this.money += mealPrice;
                        return payment - mealPrice;
                }
                return payment;
        }



        public boolean eatAffordably(PaymentCard card) {
                // an affordable meal costs 2.50 euros
                // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
                // otherwise false is returned
                double mealPrice = 2.50;
                if (card.balance() >= mealPrice){
                        affordableMeals++;
                        card.takeMoney(2.50);
                        return true;

                }
                return false;
        }

        public boolean eatHeartily(PaymentCard card) {
                // a hearty meal costs 4.30 euros
                // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
                // otherwise false is returned
                double mealPrice = 4.30;
                if (card.balance() >= mealPrice){
                        heartyMeals++;
                        card.takeMoney(4.30);
                        return true;

                }
                return false;
        }

        public void addMoneyToCard(PaymentCard card, double sum) {
                this.money = this.money + sum;
                card.addMoney(sum);



        }

        public String toString() {
            return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
        }
    }

