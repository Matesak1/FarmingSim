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
    public void grow(int chance){
        for (int i = 0; i < flowers.size(); i++) {
            if(flowers.get(i).chanceOfGrowth<=chance){
                flowers.get(i).fullyGrown = true;
            }
        }
    }
    public void zalitFlowers(){
        for (int i = 0; i < flowers.size(); i++) {
            flowers.get(i).chanceOfGrowth = flowers.get(i).chanceOfGrowth *1.1;
        }
    }
    public void sklidid(){
        for (int i = flowers.size()-1; i>=0; i--) {
            if(flowers.get(i).fullyGrown) {
                flowers.remove(i);
            }
        }
    }
}
