import Behaviour.ISell;

public class Item implements ISell {
    private String name;
    private String description;
    private double boughtPrice;
    private double sellPrice;

    public Item(String name, String description, double boughtPrice, double sellPrice){
        this.name = name;
        this.description = description;
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
    }

    public String getName() {
        return name;
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
