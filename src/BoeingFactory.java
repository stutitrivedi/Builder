public class BoeingFactory implements AirplaneFactory {
    @Override
    public void build() {
        System.out.println("Boeing built an airplane");
    }

    @Override
    public void repair() {
        System.out.println("Boeing repaired an airplane");
    }

    @Override
    public void restore() {
        System.out.println("Boeing restored an airplane");
    }
}
