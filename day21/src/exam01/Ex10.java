package exam01;

import java.io.*;

public class Ex10 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("hello3.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr)){

//            문자열을 한줄 씨 읽기
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
