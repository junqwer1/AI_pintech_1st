package exam02;

public class Ex01 {
    public static void main(String[] args) {
        String str1 = "ABC"; // 문자열 상수
        String str2 = "ABC"; // 문자열 상수
        System.out.printf("str1.equals(str2) : %s%n", str1.equals(str2)); // 동등성 비교
        System.out.printf("str1 == str2 : %s%n", str1 == str2); // 동일성 비교

        System.out.printf("str1 주소 : %s%n", System.identityHashCode(str1));
        System.out.printf("str2 주소 : %s%n", System.identityHashCode(str2));

        String str3 = new String("ABC");
        String str4 = new String("ABC");

        System.out.printf("str3.equlas(str3) : %s%n", str3.equals(str4));
        System.out.printf("str3 == str4 : %s%n", str3 == str4);

        System.out.printf("str3 주소 : %s%n", System.identityHashCode(str3));
        System.out.printf("str4 주소 : %s%n", System.identityHashCode(str4));
    }
}
