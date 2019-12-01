import Behaviour.IPlay;

public class Trumpet extends Instrument implements IPlay {

    private int valves;

    public Trumpet(int valves, String colour) {
        super("Metal", colour, "Brass");
        this.valves = valves;
    }

    public int getNumberOfValves() {
        return this.valves;
    }

    public String play() {
        return "Toot";
    }
}
