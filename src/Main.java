import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Contact petr = new Contact("Petr", 89215407458L);
        Contact joni = new Contact("jon", 89616123666L);


        Map<String, Long> map = new HashMap<>();
        map.put(joni.name, joni.number);
        map.put("Petr", petr.number);
        System.out.println(map);
        Long age = map.get("Petr");

    }
}