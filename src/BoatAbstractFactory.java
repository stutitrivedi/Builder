public abstract class BoatAbstractFactory {
    public abstract BoatFactory createBoatFactory(String factoryName);

    public static BoatAbstractFactory getFactory() {
        return new BoatConcreteFactory();
    }

    private static class BoatConcreteFactory extends BoatAbstractFactory {
        @Override
        public BoatFactory createBoatFactory(String factoryName) {
            if (factoryName.equalsIgnoreCase("SeaRay")) {
                return new SeaRayFactory();
            } else if (factoryName.equalsIgnoreCase("Mastercraft")) {
                return new MastercraftFactory();
            } else if (factoryName.equalsIgnoreCase("Bertram")) {
                return new BertramFactory();
            } else {
                throw new IllegalArgumentException("Invalid factory name.");
            }
        }
    }
}