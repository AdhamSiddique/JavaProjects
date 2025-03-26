public class LicensePlate {

    private final String liNumber;
    private final String country;

    // these instance variables have been defined as final, meaning
    // that once set, their value can't be changed
    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }
    @Override
    public boolean equals (Object object){
        if (this == object){
            return true;
        }

        if (!(object instanceof LicensePlate)){
            return false;
        }

        LicensePlate otherDate = (LicensePlate) object;

        return this.liNumber.equals(otherDate.liNumber )&&
                this.country.equals(otherDate.country);
    }

    public int hashCode(){
        return liNumber.hashCode() + country.hashCode();
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }
}
