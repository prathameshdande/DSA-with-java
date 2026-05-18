import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapBasics {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();
        //insertion
        m.put("in", "India");
        m.put("au", "Australia");
        m.put("jpn", "Japan");

        System.out.println(m);

        Map<String, String> n = new HashMap<>();
        n.put("en", "England");
        System.out.println(n);
        n.putAll(m);
        System.out.println(n);

        n.remove("en");
        System.out.println(n);
        n.putIfAbsent("ch", "Chine" );
        System.out.println(n);
        System.out.println(n.size());
        System.out.println(n.get("ch"));
        System.out.println(n.getOrDefault("nz", "Not Found"));
        System.out.println(n.containsKey("ch"));
        System.out.println(n.containsValue("India"));
        n.replace("au", "AUS");
        System.out.println(n);
        Set<String> keySet = n.keySet();
        System.out.println(keySet);
        Collection<String> keyValues = n.values();
        System.out.println(keyValues);
        Set<Map.Entry<String, String>> entrySet = n.entrySet();
        System.out.println(entrySet);

        for(Map.Entry<String, String> entry : entrySet){
            System.out.println("Key " + entry.getKey() + " : Value: " + entry.getValue());
        }


    }
}
