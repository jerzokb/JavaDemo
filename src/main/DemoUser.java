public class DemoUser {
    public static void main(String[] args) {
        // typ nazwa = wartosc;
        /*User user1 = new User(); // wywolanie konstruktora z klasy User; konstruktor domyslny
        user1.firstName = "Bartek";
        user1.lastName = "Testowy";
        user1.email = "bartek@javadem.pl";
        user1.age = 30;
        user1.likeIceCream = true;*/
        User user1 = new User("Bartek", "Testowy", "bartek@javadem.pl", 30, true);
        User user2 = new User("Tomasz", "Programowy", "tomek@javadem.pl", 17, false);
        System.out.println("User name: " + user1.getFirstName() + ". User lastname: " + user1.getLastName() + ". User email: "
                + user1.getEmail() + ". User age: " + user1.getAge() + ". Like icecream? " + user1.getLikeIceCream());
        user1.introduceYourself();
        System.out.println("Jest pelnoletni: " + user1.isAdult());
        user2.introduceYourself();
        System.out.println("Jest pelnoletni: " + user2.isAdult());
        user1.metodaZParametrem("jeden");
        user1.metodaZParametrem("jeden", "dwa");

        Car bmw = new Car("BMW Z1", "Green", "3,5");
        System.out.println(bmw.getName());
        System.out.println(bmw.getColor());
        System.out.println(bmw.getEngineSize());

        FamilyCar familyCar = new FamilyCar("Opel", "Red", "2.0", "Family car");
        SportsCar sportsCar = new SportsCar("Ferrari", "Red", "4.0", "Sports car");
        familyCar.describe();
    }
}
