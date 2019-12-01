import Behaviour.IPlay;

public class Piano extends Instrument implements IPlay {

    private String pianoType;

    public Piano(String pianoType, String construction, String colour) {
        super(construction, colour, "Percussion");
        this.pianoType = pianoType;
    }

    public String play() {
        return "Twing";
    }

    public String getPianoType() {
        return this.pianoType;
    }
}
