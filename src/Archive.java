public class Archive {

    public String name;
    public String identifier;


    public Archive (String name, String identifier){
        this.name = name;
        this.identifier = identifier;

    }

    public String getName(){
        return this.name;
    }

    public String getIdentifier(){
        return this.identifier;
    }

    public boolean equals(Object compared){
        if (this == compared){
            return true;
        }

        if (!(compared instanceof Archive)){
            return false;
        }

        Archive compareArchive = (Archive) compared;

        return this.name.equals(compareArchive.name) && this.identifier.equals(compareArchive.identifier);

    }
    @Override
    public String toString(){
        return this.identifier + ":" + this.name;
    }


}
