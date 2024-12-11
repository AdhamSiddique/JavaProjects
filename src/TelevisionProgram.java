public class TelevisionProgram {

    private String name;
    private int duration;

    public TelevisionProgram (String name, int maxDuration){
        this.name = name;
        this.duration = maxDuration;
    }

    public boolean isAwesome() {
        return this.name.contains("Mastechief");
    }

    public String getName(){
        return name;
    }

    public int getDuration(){
        return duration;
    }

    @Override
    public String toString(){
        return this.name + this.duration;
    }

}
