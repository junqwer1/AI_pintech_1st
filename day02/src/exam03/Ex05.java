package exam03;


public class Ex05 {
    public static void main(String[] args) {

//        변수 두 개를 선언해서 20과 3.0을 대입하고 두 변수의 사칙연산 결과를 정수로 출력해 보시오
        int num = 20;
        double num2 = 3.0;
        System.out.println("더하기" + (num + (int) num2));
        System.out.println((num - (int) num2));
        System.out.println(num * (int) num2);
        System.out.println(num / (int) num2);


//        학생 40명이 리조트에 수학여행을 갔습니다. 리조트로 수학여행을 갔습니다. 리조트는 방이 10개 있고 방번호는 1~10번까지 있습니다,
//        40명의 학생이 각각 번호표를 받아 한 방에 4명씩 배정하여 다음과 같이 출력하시오(예 : 학생1, 방번호 1번)
        int num3 = 0, room = 0;
        for(int i = 0; i < 40; i++){
            if(i % 4 < 4){
                room++;
            }
            System.out.println("학생"+i+", " + "방번호 " + room + "번");
        }

//        5층 건물이 있습니다. 1층 약국, 2층 정형외과, 3층 피부과, 4층 치과, 5층 헬스클럽입니다.
//        건물의 층을 누르면 그 층이 어떤 곳인지 알려주는 엘리베이터가 있을 때 이를 swich ~ case문으로 구현하시오(5층인 경우 ‘5층 헬스클럽입니다.’)
        int number = 5;
        switch (number){
            case 1:
                System.out.println("1층 약국입니다.");
            case 2:
                System.out.println("2층 정형외과입니다.");
            case 3:
                System.out.println("3층 피부과입니다.");
            case 4:
                System.out.println("4층 치과입니다.");
            case 5:
                System.out.println("5층 헬스클럽입니다.");
        }

//        구구단을 홀수 단만 출력하도록 프로그램을 만드시오. 구현 소스
        for(int i = 2; i < 10; i++){
            if(i % 2 == 0){
                continue;
            }
            for (int j = 1; j < 10; j++){
                System.out.println(i + "*" + j + "=" + i*j);
            }
            System.out.println();
        }

//        구구단을 단보다 곱하는 수가 크거나 같은 경우만 출력하는 프로그램을 만들어 보세요.구현 소스
        for(int i = 2; i < 10; i++){

            for (int j = 1; j < 10; j++){
                if(i <= j){
                    System.out.println(i + "*" + j + "=" + i*j);
                }
            }
            System.out.println();
        }


    }
}
