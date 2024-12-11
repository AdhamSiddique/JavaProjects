public class FitByte {

    private int age;
    private int restingHeartRate;

    public void FitByte (int age, int restingHeartRate){
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    public FitByte(int age, int restingHeartRate){
            this.age = age;
        this.restingHeartRate = restingHeartRate;

    }

    public double targetHeartRate(double percentageOfMaximum) {

        double max = 206.3 - (0.711 * age);
        double target = (max - restingHeartRate) * (percentageOfMaximum) + restingHeartRate;
        return  target;

    }

}
