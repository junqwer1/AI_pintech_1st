package exam04;

public class Ex02 {
    public static void main(String[] args) {
        Box<Apple> box = new Box<>();
        box.setItem(new Apple());

        System.out.println(box); //box.toString()

        //Box<Toy> toyBox = new Box<>(); extends를 Fruit으로만 해서 과일만 담을 수 있는 박스
    }
}
