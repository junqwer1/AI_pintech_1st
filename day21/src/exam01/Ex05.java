package exam01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05 {
    public static void main(String[] args) {
//        1바이트씩 data.zip을 읽어와서 1바이트씩 copoied_data1.zip
        long stime = System.currentTimeMillis(); // 현재 시간을 1000분의 1초 계산 숫자
        try (FileInputStream fis = new FileInputStream("data.zip"); FileOutputStream fos = new FileOutputStream("data.zip")){

            while (fis.available() > 0) {
                fos.write(fis.read());
            }

        }catch (IOException e){
            e.printStackTrace();
        }
        long etime = System.currentTimeMillis();
        System.out.printf("걸린시간 : %d%n", etime - stime);

    }
}
