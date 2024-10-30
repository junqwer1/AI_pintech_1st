package exam01;

import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.ToIntFunction;

public class Ex01 {
    public static void main(String[] args) {
        Function<String, Integer> func1 = s -> s.length(); // 문자열이 들어오면 문자열 길이를 정수로 반환하는 함수

        Function<Integer, Integer> func2 = x -> x * x; // 정수가 들어오면 정수를 제곱

//        문자열 -> 정수 길이 -> 제곱
        Function<String, Integer> func3 = func1.andThen(func2); // func1 -> func2
        Function<String, Integer> func4 = func2.compose(func1); // 

        int result = func3.apply("ABC"); // 3 -> 9
        int result2 = func4.apply("ABC");

        System.out.println(result);
        System.out.println(result2);
    }
}
