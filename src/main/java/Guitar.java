import Behaviour.IPlay;

public class Guitar implements IPlay {

    private String guitarType;
    private int numberOfStrings;

    public Guitar(String guitarType, int numberOfStrings) {
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
