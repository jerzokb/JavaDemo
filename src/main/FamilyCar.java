public class FamilyCar extends Car {
    private String carType;

    public FamilyCar(String name, String color, String engineSize, String carType) {
        // wywolanie konstruktora z klasy matki
        super(name, color, engineSize);
        this.carType = carType;
    }

    public void describe() {
        System.out.println("Name: " + name + " color: " + color + " engine: " + engineSize + " car type " + carType);
    }
}
