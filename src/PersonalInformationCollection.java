public class PersonalInformationCollection {
    private String name;
    private String lastName;
    private String number;


    public PersonalInformationCollection (String name,String lastName,String number) {
    this.name = name;
    this.lastName = lastName;
    this.number = number;

    }

    private String getId() {
        return number;
    }

    public String getFirstName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
    @Override
    public String  toString(){
        return  "First name: " + this.name +"\n" + "Last name: " + this.lastName + "\n" + "Identification number: " + this.number;

    }


}
