import Behaviour.IPlay;

public class Trumpet implements IPlay {

    private int valves;

    public Trumpet(int valves) {
        this.valves = valves;
    }

    public int getNumberOfValves() {
        return this.valves;
    }

    public String play() {
        return "Toot";
    }
}
