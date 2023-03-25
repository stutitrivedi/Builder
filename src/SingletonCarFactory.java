public class SingletonCarFactory {
    private static SingletonCarFactory instance;

    private SingletonCarFactory() {}

    public static synchronized SingletonCarFactory getInstance() {
        if (instance == null) {
            instance = new SingletonCarFactory();
        }
        return instance;
    }

    public CarFactory getCarFactory(String factoryType) {
        if (factoryType.equalsIgnoreCase("Honda")) {
            return new HondaCarFactory();
        } else if (factoryType.equalsIgnoreCase("Porsche")) {
            return new PorscheCarFactory();
        } else if (factoryType.equalsIgnoreCase("Tesla")) {
            return new TeslaCarFactory();
        } else {
            return null;
        }
    }
}
