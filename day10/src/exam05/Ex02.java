package exam05;

public class Ex02 {
    public static void main(String[] args) {
        FruitBox<Apple> applebox = new FruitBox<>();
        applebox.add(new Apple());
        applebox.add(new Apple());
        applebox.add(new Apple());

        Juicer.make2(applebox); // Apple, Fruit, Object

        FruitBox<Fruit> grapeBox = new FruitBox<>();
        grapeBox.add(new Grape());
        grapeBox.add(new Grape());

        Juicer.make2(grapeBox);

    }
}
