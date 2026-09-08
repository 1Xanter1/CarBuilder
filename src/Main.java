public class Main {
    public static void main(String[] args) {
        CarDirector carDirector = new CarDirector();

        Car lightweightCar = carDirector.buildLightweightCar(new LightweightCarBuilder());

        Car sportsCar = carDirector.buildSportsCar(new SportscarBuilder());

        Car truck = carDirector.buildTruck(new TruckBuilder());

        System.out.println("Lightweight Car:");
        System.out.println(lightweightCar);

        System.out.println("\nSports Car:");
        System.out.println(sportsCar);

        System.out.println("\nTruck:");
        System.out.println(truck);
    }
}
