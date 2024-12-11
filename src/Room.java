import java.util.ArrayList;

public class Room {

    private ArrayList<Person> x = new ArrayList<>();

    public void add(Person person) {
        x.add(person);

    }

    public boolean isEmpty() {

        if (x.isEmpty()){
            return true;
        }
        return false;

    }

    public Person shortest (){

        if (x.isEmpty()) {
            return null;
        }

        // create an object reference for the object to be returned
        // its first value is the first object on the list
        Person returnObject = this.x.get(0);

        // go through the list
        for (Person prs: this.x) {
            // compare each object on the list
            // to the returnObject -- we compare heights
            // since we're searching for the tallest,

            if (returnObject.getHeight() > prs.getHeight()) {
                // if we find a taller person in the comparison,
                // we assign it as the value of the returnObject
                returnObject = prs;
            }
        }

        // finally, the object reference describing the
        // return object is returned
        return returnObject;


    }

    public Person take(){
        if(x.isEmpty()){
            return null;
        }

        Person shortest = shortest();
        x.remove(shortest);
        return shortest;



    }

        public ArrayList<Person> getPersons() {
            return x;
    }
    }

