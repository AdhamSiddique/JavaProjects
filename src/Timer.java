public class Timer {

    private ClockHand seconds;
    private ClockHand hundredsOfASecond;


    public Timer(){
        this.seconds = new ClockHand(60);
        this.hundredsOfASecond = new ClockHand(100);
    }

    public void advance(){
        this.hundredsOfASecond.advance();

        if (this.hundredsOfASecond.value() == 0){
            this.seconds.advance();
        }
    }

    @Override
    public String toString() {
        return this.seconds + " : " + this.hundredsOfASecond;
    }
}
