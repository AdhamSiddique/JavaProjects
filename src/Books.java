public class Books {

    private String nameOfBooks;

    private int pages;

    private int publicationYear;

    public Books (String name, int pages, int year){
        this.nameOfBooks = name;
        this.pages = pages;
        this.publicationYear = year;
    }

    public String returnName(){
        return this.nameOfBooks;
    }

    public int returnPages(){
        return this.pages;
    }


    public int publicationYear(){
        return this.publicationYear;
    }

    @Override
    public String toString(){
        return this.nameOfBooks + this.pages + this.publicationYear;
    }



}
