public class User {
    // Klasa to forma dla tworzenia obiektu
    // 1. Pola obiektu - opisuja z czego sklada sie obiekt
    /* modyfikatory dostepu
    public - dostepne w calej aplikacji
    private - tylko w konstruktorze danej klasy, w klasie, w metodzie klasy
    protected - dostep do pola z innych klas, ktore dziedzicza po naszej klasie, w tym samym pakiecie
    dobra praktyka - ustawianie pól jako prywatne
    dobra proaktyka - ustawienie metod jako publiczne*/
    // private - ukrywanie danych nazywa sie enkapsulacja
    // gettery i settery - pozwalaja na udostepnienie pol private
    // getter - do odczytywania danych
    // setter - do ustawiania danych

    private String firstName;
    private String lastName;
    private String email;

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", likeIceCream=" + likeIceCream +
                '}';
    }

    private int age;
    private Boolean likeIceCream;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getLikeIceCream() {
        return likeIceCream;
    }

    public void setLikeIceCream(Boolean likeIceCream) {
        this.likeIceCream = likeIceCream;
    }

    // 2. Konstruktor - dane, z ktorego sklasa sie obiekt
    // Konstruktor domyslny: User user1 = new User();
    public User(String firstName, String lastName, String email, int age, Boolean likeIceCream) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.likeIceCream = likeIceCream;
    }
    // 3. Metody - co obiekt moze robic
    void introduceYourself() {
        System.out.println("Hi, my name is " + firstName + " " + lastName);
    }
    Boolean isAdult() {
        if(age > 18) {
            return true;
        } else {
            return false;
        }
    }
    void metodaZParametrem(String parametr) {
        System.out.println("Parametr metody: " + parametr);
    }
    void metodaZParametrem(String parametr1, String parametr2) {
        System.out.println("Parametr1 metody: " + parametr1 + " parametr2 metody: " + parametr2);
    }
}
