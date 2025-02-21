package exam01;

public class ThreadEx1 {
    public static void main(String[] args) {
        // 메인 쓰레드에서 실행
        Thread1 th1 = new Thread1();
        th1.start();

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.printf("Main-%c%n", ch);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}

class Thread1 extends Thread {
    public void run() { // 작업 함수
//        실행 될 코드 -

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Thread1-%d%n", i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}