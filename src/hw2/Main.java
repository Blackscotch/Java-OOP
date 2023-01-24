package hw2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "user1");
        map.put(3, "user3");
        Mutable mute = new Mutable("UserName1", map);

        System.out.println(mute.getFild());
        System.out.println("Результат при воздействии гетера класса на экземпляр: ");
        mute.getFildMap().put(2, "user2");
        mute.getFildMap().keySet().forEach(System.out::println);

        System.out.println("Результат при воздействии на map, после инициализации экземпляра класса: ");
        map.put(4, "user3");
        mute.getFildMap().keySet().forEach(System.out::println);

        System.out.println("Второй экземпляр удачно отображет все измения в мапе: ");
        Mutable mute1 = new Mutable("UserName2", map);
        System.out.println(mute1.getFild());
        mute1.getFildMap().keySet().forEach(System.out::println);
    }
}
