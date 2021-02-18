import java.util.*;

public class DemoAPP {
    public static void main(String[] args) {
        // Typy danych
        System.out.println(10); // Liczby calkowite
        System.out.println(20.2); // liczba zmiennoprzecinkowa
        System.out.println("Hello from Java 11"); // Tekst
        System.out.println('X'); // Znak
        System.out.println(true); // Prawda lub falsz
        System.out.println(false); // Prawda lub falsz

        // zmienne
        // typ nazwa = wartosc;
        int number = 15;
        double doublenumber = 20.3;
        String imie = "Bartek";
        char x = 'X';
        Boolean isTrue = true;
        Boolean isFalse = false;
        int age = 30;
        System.out.println(number);
        System.out.println(doublenumber);
        System.out.println(imie);
        System.out.println(x);
        System.out.println(isTrue);
        System.out.println(isFalse);
        System.out.println("Czesc mam na imie " + imie + ", mam " + age + " lat. " + imie + " to bardzo fajne imie.");

        // operatory
        System.out.println(10 + 10);
        System.out.println(10 - 5);
        System.out.println(10 * 5);
        System.out.println(10 / 2);
        double num1 = 10;
        double num2 = 4;
        System.out.println(num1 / num2);
        System.out.println(10 < 9);
        System.out.println(10 > 9);
        System.out.println(10 == 9);
        System.out.println(10 != 9);

        System.out.println(10 == 10 && 20 > 19);
        System.out.println(10 == 10 || 20 < 19);

        // KOLEKCJA - zbior elementow tego samego typu
        // 1. Lista - element1, element2, element3
        List<String> namesList = new ArrayList<String>();
        namesList.add("Bartek"); // index 0
        namesList.add("Antek"); // index 1
        namesList.add("Filip");
        namesList.add("Artur");
        namesList.add("Romek"); // index 4
        System.out.println(namesList.size());
        System.out.println(namesList.get(0));

        // PETLE
        for(int i = 0; i < 5; i++) {
            System.out.println(namesList.get(i));
        }

        for (String name : namesList) {
            System.out.println(name);
        }

        List<User> users = new ArrayList<User>();
        users.add(new User("Bartek", "Testowy", "bartek@testowy.pl", 38, true));
        users.add(new User("Bartek1", "Testowy1", "bartek1@testowy.pl", 35, false));
        users.add(new User("Bartek2", "Testowy2", "bartek2@testowy.pl", 33, true));

        for (User user : users) {
            user.introduceYourself();
        }

        // MAPA - KLUCZ, WARTOSC
        Map<Integer, String> namesMap = new HashMap<Integer, String>();
        namesMap.put(1, "Bartek");
        namesMap.put(2, "Tomek");
        namesMap.put(3, "Marcin");
        System.out.println(namesMap.get(2));

        for (Map.Entry<Integer, String> entry: namesMap.entrySet()) {
            System.out.println(entry.getValue());
        }

        // SET - przechowuje tylko unikalne wartosci
        Set<String> namesSet = new HashSet<String>();
        namesSet.add("Bartek");
        namesSet.add("Bartek");
        namesSet.add("Bartek");
        namesSet.add("Tomek");
        System.out.println(namesSet.size());
        for (String names: namesSet) {
            System.out.println(names);
        }
    }
}
