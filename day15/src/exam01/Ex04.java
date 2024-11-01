package exam01;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Ex04 {
    public static void main(String[] args) {
        List<String> items = new LinkedList<>();
        items.add("항목1");
        items.add("항목2");
        items.add("항목3");
        items.add("항목4");
        items.add("항목5");

        ListIterator<String> iter = items.listIterator();
        // 순방향
        System.out.println("-------------순방향");
        while (iter.hasNext()){
            String item = iter.next();
            System.out.println(item);
        }

        System.out.println("---------------역방향");
        while (iter.hasPrevious()){
            String item = iter.previous();
            System.out.println(item);

        }
    }
}
