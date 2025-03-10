public abstract class Flower {

    protected String name;
    protected double price;
    protected double neededArea;
    protected double chanceOfGrowth;
    protected boolean fullyGrown = false;

    public Flower(String name, double price, double neededArea, double chanceOfGrowth) {
        this.name = name;
        this.price = price;
        this.neededArea = neededArea;
        this.chanceOfGrowth = chanceOfGrowth;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", neededArea=" + neededArea + " m "+
                ", chanceOfGrowth=" + chanceOfGrowth +
                ", has grown?= "+fullyGrown+"}\n";
    }

    public double getChanceOfGrowth() {
        return chanceOfGrowth;
    }
}
