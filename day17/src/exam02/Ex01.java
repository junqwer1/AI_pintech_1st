package exam02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        String[] items = {"항목1", "항목2", "항목3", "항목4", "항목5"}; // 배열
        // 통일된 방식으로 처리

        //중복 제거 -> *단어* -> 출력
        Arrays.stream(items).distinct().map(s ->String.format("*%s*", s)).forEach(System.out::println);


        List<String> items2 = List.of("항목1", "항목2", "항목2", "항목3", "항목4", "항목5"); // 컬렉션 리스트

        items2.stream().distinct().map(s -> String.format("*%s*", s)).forEach(System.out::println);

    }
}
