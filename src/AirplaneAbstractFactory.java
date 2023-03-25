public abstract class AirplaneAbstractFactory {
    public abstract AirplaneFactory createAirplaneFactory(String factoryName);

    public static AirplaneAbstractFactory getFactory() {
        return new AirplaneConcreteFactory();
    }

    private static class AirplaneConcreteFactory extends AirplaneAbstractFactory {
        @Override
        public AirplaneFactory createAirplaneFactory(String factoryName) {
            if (factoryName.equalsIgnoreCase("Boeing")) {
                return new BoeingFactory();
            } else if (factoryName.equalsIgnoreCase("Airbus")) {
                return new AirbusFactory();
            } else if (factoryName.equalsIgnoreCase("Embraer")) {
                return new EmbraerFactory();
            } else {
                throw new IllegalArgumentException("Invalid factory name.");
            }
        }
    }
}