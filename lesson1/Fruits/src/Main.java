public class Main {

    public static void main(String[] args) {
	// write your code here
        Orange orange = new Orange();
        Apple apple = new Apple();
        Box<Orange> orangeBox = new Box<>();
        Box<Apple> appleBox = new Box<>();
        orangeBox.add(orange);
        orangeBox.add(orange);
        orangeBox.add(orange);
        appleBox.add(apple);
        System.out.println("Вес коробки апельсинов" + ": " + orangeBox.getWeight());
        System.out.println("Вес коробки яблок" + ": " + appleBox.getWeight());
        Box<Orange> oB1 = new Box<>();
        orangeBox.move(oB1);
        System.out.println("Вес коробки апельсинов после переброски" + ": " + orangeBox.getWeight());
        System.out.println("Вес новой коробки апельсинов" + ": " + oB1.getWeight());
    }
}
