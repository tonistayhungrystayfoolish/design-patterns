package factorymethod;

public class Dog implements Animal {

    public Dog(String color) {
        System.out.println("I´m a dog with color " + color);
    }

    @Override
    public void displayBehavior() {
        System.out.println("I´m a dog behaviour");
    }
}
