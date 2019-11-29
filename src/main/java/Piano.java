import Behaviour.IPlay;

public class Piano implements IPlay {

    private String pianoType;

    public Piano(String pianoType) {
        this.pianoType = pianoType;
    }

    public String play() {
        return "Twing";
    }

    public String getPianoType() {
        return this.pianoType;
    }
}
