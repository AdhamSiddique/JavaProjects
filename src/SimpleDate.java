public class SimpleDate {
    private int day;
    private int month;
    private int year;

    // Constructor
    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Basic equals method
    public boolean equals(Object object) {
        if (this == object){
            return true;
        }

        if (!(object instanceof SimpleDate)){
            return false;
        }

        SimpleDate otherDate = (SimpleDate) object;

        return this.day == otherDate.day &&
                this.month == otherDate.month &&
                this.year == otherDate.year;
        }

        public int hashCode(){
        return day * 10 * month * 300 * year * 43;
        }


    }




