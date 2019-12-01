import Behaviour.IPlay;
import Behaviour.ISell;

public class Piano extends Instrument implements IPlay, ISell {

    private String pianoType;


    public Piano(String pianoType, String construction, String colour, String description, double boughtPrice, double sellPrice) {
        super(construction, colour, "Percussion", description, boughtPrice, sellPrice);
        this.pianoType = pianoType;
    }

    public String play() {
        return "Twing";
    }

    public String getPianoType() {
        return this.pianoType;
    }


}
