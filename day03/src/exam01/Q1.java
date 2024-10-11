package exam01;

public class Q1 {
    public static void main(String[] args) {
//        20 3.0 대입 사칙연산
        int num1 = 20;
        double num2 = 3.0;
//        double num2 = 3; // int -> double 형변환을 해야하기 때문에 일을 2번 한다

//        int result = num1 * (int)num2; // 오답
        int result = (int)(num1 * num2);
    }
}
