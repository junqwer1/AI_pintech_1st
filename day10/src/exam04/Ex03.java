package exam04;

public class Ex03 {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>(); // Fruit & Eatable
        Box<Fruit> fruitBox = new Box<Fruit>();
        fruitBox.setItem(new Apple());
        fruitBox.setItem(new Grape());
//        Box<Grape> grapeBox = new Box<>(); // Fruit

    }
}