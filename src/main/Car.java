public class Car {
    protected String name;
    protected String color;
    protected String engineSize;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(String engineSize) {
        this.engineSize = engineSize;
    }

    public Car(String name, String color, String engineSize) {
        this.name = name;
        this.color = color;
        this.engineSize = engineSize;
    }
}
