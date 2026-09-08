public class Car {
    private String model;
    private String engine;
    private String color;
    private int year;
    private String transmission;
    private String wheelsSize;
    private int seats;
    private boolean spoiler;

    public Car(String model,String engine, String color, int year, String transmission, String wheelsSize, int seats, boolean spoiler) {
        this.model = model;
        this.engine = engine;
        this.color = color;
        this.year = year;
        this.transmission = transmission;
        this.wheelsSize = wheelsSize;
        this.seats = seats;
        this.spoiler = spoiler;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                "engine='" + engine + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year + '\'' +
                ", transmission='" + transmission + '\'' +
                ", wheels='" + wheelsSize + '\'' +
                ", seats=" + seats +
                ", spoiler=" + spoiler +
                '}';
    }

    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getWheelsSize() {
        return wheelsSize;
    }

    public int getSeats() {
        return seats;
    }

    public boolean isSpoiler() {
        return spoiler;
    }
}
