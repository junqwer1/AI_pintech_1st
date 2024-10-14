package exam01;

public class Ex01 {
    /**
     * main 함수는 프로그램을 시작해 주는 함수
     * @param args
     */
    public static void main(String[] args) {
//        int num1 = 10; //main 함수 지역변수
//        int num2 = 20;
//        int result = add(num1, num2);
//        System.out.println(r);

        int result = add(10, 20); // int add(int, int)
        System.out.println(result);

        int result2 = add(10, 20, 30); // int add(int, int, int)
        System.out.println(result2);
    }


    /**
     * - 지역변수
     * num1
     * num2
     * return
    * */
    static int add(int num1, int num2){ // 매개변수 2개
        int result = num1 + num2; //add 함수의 지역변수

        return result;
    }

    static int add(int num1, int num2, int num3){ // 매개변수 2개
        int result = num1 + num2 + num3; //add 함수의 지역변수

        return result;
    }
}
