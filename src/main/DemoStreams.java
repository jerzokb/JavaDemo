import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStreams {
    public static void main(String[] args) {
        // STREAMY - strumienie wartości
        // Wykorzystywane sa przy listach
        // Metody posrednie - zwracaja nowe streamy
        // filter - filtrowanie elementow
        // map - przeksztalcanie elementow

        // Metody terminalne - sa wykonywane jako ostatnie, moga zwracac wartosc, pozwalaja zebrac wartosci do kolekcji
        // forEach - wyswietlanie elementow
        // min | max | sum
        // anyMatch | allMatch _ nonMatch
        // count
        // collect - zbieranie elementow

        List<String> names = new ArrayList<String>();
        names.add("Bartek");
        names.add("Antek");
        names.add("Filip");
        names.add("Franek");
        names.add("Feliks");
        names.add("Romek");

        for (String name : names) {
            if(name.startsWith("F")) {
                System.out.println(name);
            }
        }
        System.out.println("Tu wyswietlam filtr streama!!!");
        names.stream()
                .filter(name -> name.startsWith("F"))
                .forEach(name -> System.out.println(name));
        System.out.println("Tu jest count!!!");
        long numberOfFNames = names.stream()
                .filter(name -> name.startsWith("F"))
                .count();
        System.out.println(numberOfFNames);
        System.out.println("Tu jest map - przeksztalca kazdy element!!!");
        names.stream()
                .map(name -> name.toUpperCase())
                .forEach(name -> System.out.println(name));
        System.out.println("Tu jest map - przeksztalca kazdy element!!!");
        names.stream()
                .map(name -> name + " to jest imie!")
                .forEach(name -> System.out.println(name));
        System.out.println("Medota anyMatch!!!");
        boolean anyMatchEndsWithK = names.stream()
                .anyMatch(name -> name.endsWith("k"));
        System.out.println(anyMatchEndsWithK);
        System.out.println("Medota allMatch!!!");
        boolean allMatchEndsWithK = names.stream()
                .allMatch(name -> name.endsWith("k"));
        System.out.println(allMatchEndsWithK);
        System.out.println("Tu wyswietlam filtry streama!!!");
        List<String> namesStartsWithF = names.stream()
                .filter(name -> name.startsWith("F"))
                .filter(name -> !name.endsWith("k"))
                .collect(Collectors.toList());
        namesStartsWithF.stream()
                .forEach(System.out::println);

        System.out.println("Filtry na obiektach!!!");
        List<User> users = new ArrayList<User>();
        users.add(new User("Bartek", "Czarny", "bartek@testowy.pl", 38, true));
        users.add(new User("Tomek", "Bialy", "tomek@testowy.com", 17, false));
        users.add(new User("Michal", "Brazowy", "michal@testowy.pl", 21, true));
        users.add(new User("Lukasz", "Czerwony", "lukasz@testowy.com", 25, true));
        users.add(new User("Krzysiek", "Fioletowy", "krzysiek@testowy.eu", 56, false));
        users.add(new User("Marcin", "Zielony", "marcin@testowy.pl", 30, true));

        System.out.println("adresy emial kończą się na .pl!!!");
        users.stream()
                .filter(user -> user.getEmail().endsWith(".pl"))
                .forEach(System.out::println);
        System.out.println("nie lubią lodów!!!");
        users.stream()
                .filter(user -> user.getLikeIceCream().equals(false))
                .forEach(System.out::println);
        System.out.println("dorosli uzytkownicy!!!");
        users.stream()
                .filter(user -> user.getAge() > 18)
                .forEach(System.out::println);
        System.out.println("najmlodszy uzytkownik!!!");
        User theYoungestUser = users.stream()
                .min(Comparator.comparing(user -> user.getAge()))
                .get();
        theYoungestUser.introduceYourself();
    }
}
