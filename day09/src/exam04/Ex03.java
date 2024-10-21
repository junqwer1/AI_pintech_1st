package exam04;

public class Ex03 {
    public static void main(String[] args) {
//        Transportation trans = Transportation.SUBWAY;
        Transportation trans2 = Transportation. BUS;
        String transStr = trans2.name(); // <- 변경 불가 trans.toString() 변경 가능
        System.out.println(transStr);

        int ordinal = trans2.ordinal();
        System.out.printf("ordinal:%d,%n",ordinal); // 상수가 정의된 순서 위치 변환
    }
}
