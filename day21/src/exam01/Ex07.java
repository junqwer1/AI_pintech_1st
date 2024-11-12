package exam01;

import java.io.FileOutputStream;
import java.io.IOException;

public class Ex07 {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("hello.txt")) {
            //문자표가 서로 다르기 때문에 알맞게 안 나옴
            //(유니코드)
            fos.write('안');
            fos.write('녕');
            fos.write('하');
            fos.write('세');
            fos.write('요');
            fos.write('.');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
