public class PersonTwo {
    private String name;
    private SimpleDate birthday;

    private int height;
    private int weight;

    public PersonTwo(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;

        }

        if (!(compared instanceof PersonTwo)) {
            return false;
        }

        PersonTwo comparedPerson = (PersonTwo) compared;

        if (this.name.equals(comparedPerson.name) && this.birthday.equals(comparedPerson.birthday)
                && this.height == comparedPerson.height && this.weight == comparedPerson.weight) {
            return true;
        }
        return false;
    }

}
