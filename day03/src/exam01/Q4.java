package exam01;

public class Q4 {
    public static void main(String[] args) {
//        구구단 홀수만 출력
        for(int i = 2; i < 10; i++){
            if(i % 2 == 0){
                continue;
            }
            for (int j = 1; j < 10; j++){
                System.out.println(i + "*" + j + "=" + i*j);
            }
            System.out.println();
        }
    }
}
