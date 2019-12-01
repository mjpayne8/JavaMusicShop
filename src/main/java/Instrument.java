public abstract class Instrument {

    private String construction;
    private String colour;
    private String type;

    public Instrument(String construction, String colour, String type){
        this.construction = construction;
        this.colour = colour;
        this.type = type;
    }

    public String getConstruction() {
        return construction;
    }

    public String getColour(){
        return colour;
    }

    public String getType() {
        return type;
    }
}
