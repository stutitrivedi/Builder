public class Driver {
    public static void main(String[] args) {
        // Create car factories
        CarAbstractFactory carFactory = CarAbstractFactory.getFactory();
        CarFactory hondaFactory = carFactory.createCarFactory("Honda");
        CarFactory porscheFactory = carFactory.createCarFactory("Porsche");
        CarFactory teslaFactory = carFactory.createCarFactory("Tesla");

        // Call methods on car factories
        System.out.println("Car Factories");
        hondaFactory.build();    // Honda built a car
        hondaFactory.repair();
        hondaFactory.restore();
        System.out.println("...................................");
        porscheFactory.build(); // Porsche repaired a car
        porscheFactory.repair();
        porscheFactory.restore();
        System.out.println("...................................");
        teslaFactory.build();
        teslaFactory.restore();
        teslaFactory.repair();


        // Attempt to create a second Tesla factory (should return the same instance)
        SingletonCarFactory teslaSingleton1 = SingletonCarFactory.getInstance();
        SingletonCarFactory teslaSingleton2 = SingletonCarFactory.getInstance();
        // from Singleton Design pattern
        System.out.println("...................................");
        System.out.println("Check weather only one instantiate of a factory exist at a given time = "+ (teslaSingleton1 == teslaSingleton2)); // true
        System.out.println("...................................\n");

        // Create airplane factories
        AirplaneAbstractFactory airplaneFactory = AirplaneAbstractFactory.getFactory();
        AirplaneFactory boeingFactory = airplaneFactory.createAirplaneFactory("Boeing");
        AirplaneFactory airbusFactory = airplaneFactory.createAirplaneFactory("Airbus");
        AirplaneFactory embraerFactory = airplaneFactory.createAirplaneFactory("Embraer");

        // Call methods on airplane factories
        System.out.println("Airplane Factories");
        boeingFactory.build();     // Boeing built an airplane
        boeingFactory.repair();
        boeingFactory.restore();
        System.out.println("...................................");
        airbusFactory.build();    // Airbus repaired an airplane
        airbusFactory.repair();
        airbusFactory.restore();
        System.out.println("...................................");
        embraerFactory.build();
        embraerFactory.repair();
        embraerFactory.restore();  // Embraer restored an airplane

        // Attempt to create a second Airbus factory (should return the same instance)
        SingletonAirplaneFactory airbusSingleton1 = SingletonAirplaneFactory.getInstance();
        SingletonAirplaneFactory airbusSingleton2 = SingletonAirplaneFactory.getInstance();
        // from Singelton Design pattern
        System.out.println("...................................");
        System.out.println("Check weather only one instantiate of a factory exist at a given time = "+(airbusSingleton1 == airbusSingleton2)); // true

        // Add three Boats factories
        System.out.println("...................................\n");
        System.out.println("Modified program that add three Boat Factories");
        BoatAbstractFactory BoatFactory = BoatAbstractFactory.getFactory();
        BoatFactory searayFactory = BoatFactory.createBoatFactory("SeaRay");
        BoatFactory mastercraftFactory = BoatFactory.createBoatFactory("Mastercraft");
        BoatFactory bertramFactory = BoatFactory.createBoatFactory("Bertram");

        // call methods for Boats factories
        searayFactory.build();
        searayFactory.repair();
        searayFactory.restore();
        System.out.println("...................................");
        mastercraftFactory.build();
        mastercraftFactory.repair();
        mastercraftFactory.restore();
        System.out.println("...................................");
        bertramFactory.build();
        bertramFactory.repair();
        bertramFactory.restore();



    }
}
