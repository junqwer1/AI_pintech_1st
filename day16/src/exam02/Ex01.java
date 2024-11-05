package exam02;

import java.util.HashMap;
import java.util.Map;

public class Ex01 {
    public static void main(String[] args) {
        Map<String, String> member = new HashMap<>();
        member.put("user01", "사용자01");
        member.put("user02", "사용자02");
        member.put("user03", "사용자03");
        member.put("user04", "사용자04");

        member.put("user01", "사용자99");

        System.out.println(member);
        member.remove("user02");
        String userName02 = member.get("user02");

        System.out.println(userName02);

    }
}
