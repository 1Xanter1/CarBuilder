public interface CarBuilder {
    CarBuilder setModel(String model);
    CarBuilder setEngine(String engine);
    CarBuilder setColor(String color);
    CarBuilder setYear(int year);
    CarBuilder setTransmission(String transmission);
    CarBuilder setWheelsSize(String wheelsSize);
    CarBuilder setSeats(int seats);
    CarBuilder setSpoiler(boolean spoiler);

    Car build();
}
