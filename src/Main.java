import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rd = new Random();
        Farm farm = new Farm();
        farm.zasaditRostlinu("obili", 5, 10, 50);
        farm.zasaditRostlinu("psenice", 10, 15, 70);
        farm.zasaditRostlinu("mrkev", 30, 50, 25);
        farm.grow(rd.nextInt(100));
        farm.zalitFlowers();
        farm.grow(100);
        System.out.println(farm.toString());
    }
}