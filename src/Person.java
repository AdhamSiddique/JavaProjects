public class Person {
    private String name;
    private int height;

    public Person (String name,int height){
            this.name = name;
            this.height = height;

    }

    public String getName(){
        return name;
    }

    public int getHeight(){
        return height;
    }

    @Override
    public String toString(){
        return this.name + " (" + this.height + " cm)";
    }
}
