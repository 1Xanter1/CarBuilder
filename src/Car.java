public class Car {

    private String model;
    private String engine;
    private String color;
    private int year;
    private String transmission;
    private String wheelsSize;
    private int seats;
    private boolean spoiler;

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

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getWheelsSize() {
        return wheelsSize;
    }

    public void setWheelsSize(String wheelsSize) {
        this.wheelsSize = wheelsSize;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public boolean isSpoiler() {
        return spoiler;
    }

    public void setSpoiler(boolean spoiler) {
        this.spoiler = spoiler;
    }
}
