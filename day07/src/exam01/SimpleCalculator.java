package exam01;

public class SimpleCalculator extends Calculator {

    public SimpleCalculator() {
        super();

    }

    @Override //애노테이션
    public int add(int num1, int num2) {
        return num1 + num2;
    }
}
