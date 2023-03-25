public class MastercraftFactory implements BoatFactory {
    @Override
    public void build() {
        System.out.println("Mastercraft  built a boat");
    }

    @Override
    public void repair() {
        System.out.println("Mastercraft repaired a boat");
    }

    @Override
    public void restore() {
        System.out.println("Mastercraft restored a boat");
    }
}
