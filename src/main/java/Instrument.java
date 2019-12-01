import Behaviour.ISell;

public abstract class Instrument implements ISell {

    private String construction;
    private String colour;
    private String type;
    private String description;
    private double boughtPrice;
    private double sellPrice;

    public Instrument(String construction, String colour, String type, String description, double boughtPrice, double sellPrice){
        this.construction = construction;
        this.colour = colour;
        this.type = type;
        this.description = description;
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
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

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public String getDescription() {
        return description;
    }

    public double markUp() {
        return (sellPrice/boughtPrice) - 1;
    }
}
