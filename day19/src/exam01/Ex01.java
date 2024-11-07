package exam01;

import java.util.Optional;

public class Ex01 {
    public static void main(String[] args) {
        /*String str = "null";
        Optional<String> opt = Optional.of(str);// null 쓰면 오류*/
        String str = null;
        Optional<String> opt = Optional.ofNullable(str);// null 써도 오류 x

//        String str2 = opt.get(); // 값이 없으면 NoSuchElementException 발생
        String str2 = opt.orElse("ABC");
        System.out.println(str2);
    }
}
