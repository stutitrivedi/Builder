public class BertramFactory implements BoatFactory {
    @Override
    public void build() {
        System.out.println("Bertram built a boat");
    }

    @Override
    public void repair() {
        System.out.println("Bertram repaired a boat");
    }

    @Override
    public void restore() {
        System.out.println("Bertram restored a boat");
    }
}

