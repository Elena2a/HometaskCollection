package ru.tsystems.autotest;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<User> user = new ArrayList<>();
        User user1 = new User (15, "Anna");
        User user2 = new User (19, "Peter");
        user.add(user1);
        user.add(user2);

        listSample();
        setSample();
        mapSample();
    }
    public static List<User> userIntersection(List<User> A, List<User> B) {
        List<User> user = new ArrayList<>();
        for ( User a : A ) {
            if (B.contains(a)) {
                user.add(a);
            }
        }
        return user;
    }
    public static Set<User> intersection(Set<User> set1, Set<User> set2) {
        Set<User> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }
    private static void listSample() {

        List<String> country = new ArrayList<>();
        country.add("Russia");
        country.add("England");
        country.add("Italy");
        country.add("England");
        System.out.println(country);
        for ( int i = 0; i < country.size(); i++ ) {

           System.out.println(country.indexOf("Russia") + country.get(i));
                  }
        for ( String str : country)
            System.out.println(country);
        }

    private static void setSample() {
        HashSet<String> city = new HashSet<>();
        city.add("Voronezh");
        city.add("Moscow");
        city.add("London");
        city.add("Moscow");
        System.out.println(city);
        // HashSet итерация
        System.out.println("Iterating:");
        Iterator<String> i = city.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
    private static void mapSample() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "John");
        map.put(2, "Mary");
        map.put(1, "Nick");
        System.out.println("map size: " + map.size());
        System.out.println();
        final Set<Integer> keySet = map.keySet();
        for ( Integer key : keySet ) {
            System.out.println("key: " + key);
        }
        System.out.println();
        final Collection<String> values = map.values();
        for ( String value : values ) {
            System.out.println("value: " + value);
        }
        System.out.println();
        final Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for ( Map.Entry<Integer, String> entry : entries ) {
            System.out.println("entry: key: " + entry.getKey() + ", value: " + entry.getValue());
        }
        System.out.println();
        System.out.println(map.getOrDefault (2, "default value"));
    }
}

