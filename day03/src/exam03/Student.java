package exam03;

public class Student {
    int id; // 학번
    String name; // 이름  변수정의
    String major; // 전공과목

    void study(){
        System.out.printf("%s는(은) 학번이 %d이고 %s를 공부한다.%n", name, id, major); // 함수 정의
    }

}
