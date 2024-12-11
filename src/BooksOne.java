public class BooksOne {

    private String name;
    private int publicationYear;

    public BooksOne(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof BooksOne)) {
            return false;
        }

        BooksOne comparedBooks = (BooksOne) compared;

        if (this.name.equals(comparedBooks.name) && this.publicationYear == comparedBooks.publicationYear){
            return true;
        }
        return false;



    }

}




