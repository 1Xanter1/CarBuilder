public class CarDirector {

    public Car buildLightweightCar(CarBuilder carBuilder) {
        return carBuilder
                .setModel("Toyota")
                .setEngine("2L")
                .setColor("Black")
                .setYear(2017)
                .setTransmission("Auto")
                .setSeats(4)
                .setWheelsSize("16-inch")
                .setSpoiler(false)
                .build();
    }
    public Car buildSportsCar(CarBuilder carBuilder) {
        return carBuilder
                .setModel("Ford Mustang GT")
                .setEngine("5.0L V8")
                .setColor("Red")
                .setYear(2026)
                .setTransmission("Auto")
                .setSeats(2)
                .setWheelsSize("10-inch")
                .setSpoiler(true)
                .build();
    }
    public Car buildTruck(CarBuilder carBuilder) {
        return carBuilder
                .setModel("Ford F-150")
                .setEngine("5.0L V8")
                .setColor("Silver")
                .setYear(2023)
                .setTransmission("Auto")
                .setSeats(5)
                .setWheelsSize("18-inch")
                .setSpoiler(false)
                .build();
    }
}
