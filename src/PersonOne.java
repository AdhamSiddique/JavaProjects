public class PersonOne {

    private String name;
    private Pet pet;

    public PersonOne(String name, Pet pet) {
        this.name = name;
        this.pet = pet;

    }

    public PersonOne(String name){
        this(name, new Pet("Toothless", "dragon"));
    }

    public PersonOne(){
        this("Lilo",new Pet("Stitch", "blue alien"));
    }

    @Override
    public String toString(){
        return this.name + " Has a friend called " + pet.getName() + "(" + pet.getBreed() + ")";
    }

}
