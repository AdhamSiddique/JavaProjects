public class SimpleDateTwo {
    private int day;
    private int month;
    private int year;

    public SimpleDateTwo(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public void advance(){
        
    }

    public void advance (int howManyDays){
        for(int i = 0; i < howManyDays; i++)
        advance();
    }

        public SimpleDateTwo afterNumberOfDays(int days) {
            SimpleDateTwo newDate = new SimpleDateTwo(this.day,this.month,this.year);

            return newDate;
        }

    public boolean before(SimpleDateTwo compared) {
        // first compare years
        if (this.year < compared.year) {
            return true;
        }

        // if the years are the same, compare months
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        // the years and the months are the same, compare days
        if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day) {
            return true;
        }

        return false;
    }
}