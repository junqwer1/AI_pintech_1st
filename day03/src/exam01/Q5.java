package exam01;

public class Q5 {
    public static void main(String[] args) {
        for(int i = 2; i < 10; i++){
            System.out.printf("%d단%n", i);
            for (int j = 1; j < 10; j++){
                if (j < i){
                    continue;
                }
                System.out.printf("%d * %d = %d%n", i, j, i*j);
                /*if(i <= j){
                    System.out.printf("%d * %d = %d", i, j, i*j);
                }*/
            }
            System.out.println();
        }
    }
}
