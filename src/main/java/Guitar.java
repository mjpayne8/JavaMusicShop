import Behaviour.IPlay;
import Behaviour.ISell;

public class Guitar extends Instrument implements IPlay, ISell {

    private String guitarType;
    private int numberOfStrings;

    public Guitar(String guitarType,
                  int numberOfStrings,
                  String construction,
                  String colour,
                  String description,
                  double boughtPrice,
                  double sellPrice)
    {
        super(construction, colour, "String", description, boughtPrice, sellPrice);
        this.guitarType = guitarType;
        this.numberOfStrings = numberOfStrings;
    }

    public String getGuitarType() {
        return this.guitarType;
    }

    public int getNumberOfSrings() {
        return this.numberOfStrings;
    }

    public String play() {
        return "Twang";
    }

}
