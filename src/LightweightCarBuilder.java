public class LightweightCarBuilder implements CarBuilder {
    private Car car = new Car();

    @Override
    public CarBuilder setModel(String model) {
        car.setModel(model);
        return this;
    }

    @Override
    public CarBuilder setEngine(String engine) {
        car.setEngine(engine);
        return this;
    }

    @Override
    public CarBuilder setColor(String color) {
        car.setColor(color);
        return this;
    }

    @Override
    public CarBuilder setYear(int year) {
        car.setYear(year);
        return this;
    }

    @Override
    public CarBuilder setTransmission(String transmission) {
        car.setTransmission(transmission);
        return this;
    }

    @Override
    public CarBuilder setWheelsSize(String wheelsSize) {
        car.setWheelsSize(wheelsSize);
        return this;
    }
    @Override
    public CarBuilder setSeats(int seats) {
        car.setSeats(seats);
        return this;
    }
    @Override
    public CarBuilder setSpoiler(boolean spoiler) {
        car.setSpoiler(spoiler);
        return this;
    }
    /// Before:
//    @Override
//    public Car build() {
//        return car;
//    }
    @Override
    public Car build() {
        if (car.getModel() == null || car.getModel().isBlank()) {
            throw new IllegalStateException("Car model is required");
        }

        if (car.getEngine() == null || car.getEngine().isBlank()) {
            throw new IllegalStateException("Car engine is required");
        }

        if (car.getYear() < 1886) {
            throw new IllegalStateException("Invalid car year");
        }

        if (car.getSeats() <= 0) {
            throw new IllegalStateException("Number of seats must be positive");
        }

        return car;
    }
}
