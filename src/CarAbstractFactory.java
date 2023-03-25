public abstract class CarAbstractFactory {
    public abstract CarFactory createCarFactory(String factoryName);

    public static CarAbstractFactory getFactory() {
        return new CarConcreteFactory();
    }

    private static class CarConcreteFactory extends CarAbstractFactory {
        @Override
        public CarFactory createCarFactory(String factoryName) {
            if (factoryName.equalsIgnoreCase("Honda")) {
                return new HondaCarFactory();
            } else if (factoryName.equalsIgnoreCase("Porsche")) {
                return new PorscheCarFactory();
            } else if (factoryName.equalsIgnoreCase("Tesla")) {
                return new TeslaCarFactory();
            } else {
                throw new IllegalArgumentException("Invalid factory name.");
            }
        }
    }
}