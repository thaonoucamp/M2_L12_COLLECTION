import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        // 1 - tao danh sach luu theo (key - hashMap);
        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("a", 1);
        hashMap.put("b", 2);
        hashMap.put("c", 3);
        hashMap.put("d", 4);

        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        // 2 - hien thi theo gia tri tang/giama(treeMap);
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);

        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        // 3 - tao LinkedHashMapde luu danh sach tuong va hien thi du lieu;
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("a", 30);
        linkedHashMap.put("b", 31);
        linkedHashMap.put("c", 29);
        linkedHashMap.put("d", 29);

        System.out.println("\n The age for " + " C is " + linkedHashMap.get("C"));
    }

}
