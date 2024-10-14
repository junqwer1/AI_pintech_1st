package exam02;

// exam02.Student : 전체 클래스명

public class Student {
//    변수 정의
    int id; //학번
    String name; //학생명
    String major; //전공과목

    /**
     * 따로 정의 하지 않으면 기본 생성되는 생성자
     * 디폴트 생성자
    * */
    public Student() {
        //객체 생성 이후 실행
        //객체의 변수의 초기화
        id = 1000;
        name = "이이름";
        major = "영어";
    } //객체가 없으면 목적을 달성할 수 없기 때문에 컴파일러가 알아서 추가

    public Student(int _id, String _name,String _major){
        id = _id;
        name = _name;
        major = _major;
    }

//    함수 정의
    void showInfo(){
        System.out.printf("id = %d, name = %s, major = %s%n", id, name, major);

    }

}
