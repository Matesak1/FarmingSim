import java.util.ArrayList;

public class Stodola {
    ArrayList<Animal> stodolaBig = new ArrayList<>();
    ArrayList<Animal> stodolaSmall = new ArrayList<>();
    public void pridatZvire(String typ, String name, Size size, String care) {
        switch (size) {
            case BIG -> {
                if (stodolaBig.size() < 10) {
                    stodolaBig.add(new Animal(typ, name, size, care) {
                        @Override
                        public String toString() {
                            return super.toString();
                        }
                    });
                }
            }
            case SMALL -> {
                if (stodolaSmall.size() < 10) {
                    stodolaSmall.add(new Animal(typ,name,size,care) {
                        @Override
                        public String toString() {
                            return super.toString();
                        }
                    });
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Stodola{" +
                "stodolaBig=\n" + stodolaBig +
                ",\n stodolaSmall=\n" + stodolaSmall +
                '}';
    }
}
