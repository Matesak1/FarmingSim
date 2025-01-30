import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rd = new Random();
        Farm farm = new Farm();
        Stodola stodola = new Stodola();
        farm.zasaditRostlinu("obili", 5, 10, 50);
        farm.zasaditRostlinu("psenice", 10, 15, 70);
        farm.zasaditRostlinu("mrkev", 30, 50, 25);
        farm.grow(rd.nextInt(100));
        farm.zalitFlowers();
        farm.grow(rd.nextInt(100));
        System.out.println(farm.toString());
        farm.sklidid();
        System.out.println(farm.toString());
        System.out.println();
        stodola.pridatZvire("lachtan","Onyx",Size.BIG,"Best combo with water");
        stodola.pridatZvire("zirafa","Cat",Size.BIG,"Needs high roof");
        stodola.pridatZvire("zralok","Jeff",Size.SMALL,"Lives in water");
        stodola.pridatZvire("clovek","Ondrej",Size.SMALL,"Needs new classes every now and then");
        System.out.println(stodola.toString());
    }
}