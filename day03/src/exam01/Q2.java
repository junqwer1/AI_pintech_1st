package exam01;

public class Q2 {
    public static void main(String[] args) {
//        학생 40  방 10 번호 0~9
        for (int i = 0; i < 40; i++){
            int room = i%10;
            System.out.printf("학생%d, 방번호 %d번%n", i+1, room+1);
        }
    }
}
