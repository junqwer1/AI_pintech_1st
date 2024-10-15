package exam04;

//import exam03.A;
//import exam03.B;
//import  exam03.*; // exam03에 포함된 모든 클래스

import exam03.A;

import java.util.Scanner;


public class Ex01 {
    public static void main(String[] args) {
        A a = new A();
        //B b = new B();
        //a.num1 // 접근 불가 (default)
        a.num2 = 20; // 접근 가능 (public)


        Scanner sc = new Scanner(System.in);

        System.out.print("넌 지금 뭐하고 싶어? ");
        String home = sc.next();

        System.out.println("나도ㅎㅎ");


    }
}
