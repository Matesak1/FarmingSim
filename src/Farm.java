import java.util.ArrayList;

public class Farm {
    ArrayList<Flower> flowers = new ArrayList<>();
    private double velikostFarmyMetr = 10000;
    public void zasaditRostlinu(String name, double price, double space, double growthChance){
        if(velikostFarmyMetr >=space){
            if(flowers.size()!=5) {
                flowers.add(new Flower(name, price, space, growthChance) {
                    @Override
                    public String toString() {
                        return super.toString();
                    }
                });
                velikostFarmyMetr = velikostFarmyMetr - space;
            }
        }
    }

    @Override
    public String toString() {
        return "Farm{" +
                "flowers=" + flowers +
                '}';
    }
}
