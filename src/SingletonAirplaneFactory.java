public class SingletonAirplaneFactory {
    private static SingletonAirplaneFactory instance;

    private SingletonAirplaneFactory() {}

    public static synchronized SingletonAirplaneFactory getInstance() {
        if (instance == null) {
            instance = new SingletonAirplaneFactory();
        }
        return instance;
    }

    public AirplaneFactory getAirplaneFactory(String factoryType) {
        if (factoryType.equalsIgnoreCase("Boeing")) {
            return new BoeingFactory();
        } else if (factoryType.equalsIgnoreCase("Airbus")) {
            return new AirbusFactory();
        } else if (factoryType.equalsIgnoreCase("Embraer")) {
            return new EmbraerFactory();
        } else {
            return null;
        }
    }
}