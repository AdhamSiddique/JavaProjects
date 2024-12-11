public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {
        int priceDiffrence = this.squares * this.pricePerSquare - compared.squares * compared.pricePerSquare;
        if(priceDiffrence >= 0){
            return priceDiffrence;
        }else{
            return -priceDiffrence;
        }
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int moreExpensiveThan = this.squares * this.pricePerSquare;
        int compareMoreExpensive = compared.squares * compared.pricePerSquare;

        if (moreExpensiveThan >= compareMoreExpensive){
            return true;
        } else {
            return false;
        }

    }


}



