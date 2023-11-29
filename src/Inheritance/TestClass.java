package Inheritance;

public class TestClass {
    public static void main(String[] args) {
        SimpleCat cat = new SimpleCat();
        SimpleLion lion = new SimpleLion();

        System.out.println(cat.canEatPersone == lion.canEatPersone);
    }
}
