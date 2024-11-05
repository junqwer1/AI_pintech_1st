package exam02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex02 {
    public static void main(String[] args) {
        Map<String, String> member = new HashMap<>();
        member.put("user01", "사용자01");
        member.put("user02", "사용자02");
        member.put("user03", "사용자03");
        member.put("user04", "사용자04");

        Set<Map.Entry<String, String>> entries =  member.entrySet();

        for (Map.Entry<String, String> entry : entries){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.printf("key = %s, value = %s%n", key, value);
        }

        for (Map.Entry<String, String> entry : member.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.printf("key = %s, value = %s%n", key, value);
        }
    }
}
