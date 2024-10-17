package exam03;

public interface Buyer {
    void buy();

    int NUM = 10; // public static final

    default void order() { // JDk 7
        System.out.println("Buyer - 주문");
        privateMethod();
    }

    private void privateMethod() { // JDK 9
        System.out.println("private 메서드");
    }

    static void staticMethod() {
        System.out.println("정적 메서드");
    }
}
