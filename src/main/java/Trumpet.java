import Behaviour.IPlay;

public class Trumpet extends Instrument implements IPlay {

    private int valves;

    public Trumpet(int valves, String colour, String description, double boughtPrice, double sellPrice ) {
        super("Metal", colour, "Brass", description, boughtPrice, sellPrice);
        this.valves = valves;
    }

    public int getNumberOfValves() {
        return this.valves;
    }

    public String play() {
        return "Toot";
    }
}
