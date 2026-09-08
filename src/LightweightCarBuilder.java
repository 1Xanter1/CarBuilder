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

    @Override
    public Car build() {
        return car;
    }
}
