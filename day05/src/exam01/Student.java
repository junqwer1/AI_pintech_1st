package exam01;

public class Student {
    static int id; // 학번
    String name; // 이름
    String major; // 전공

    public Student(){} // 기본생성자 필수불가결 주소값이 반환값

    void showInfo() {
        System.out.printf("id = %d, name = %s, major = %s%n", id, name, major);
    }

    static void staticMethod() {
        System.out.println("정적 메서드!");
//        this.name = "이이름";
        id = 1000; // 정적 변수
        //showInfo();
        staticMethod2();
    }
    static void staticMethod2() {

    }
}
