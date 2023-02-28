package factorymethod;

public class Tiger implements Animal{

    public Tiger(String color){
        System.out.println("I´m a tiger with color " +color);
    }

    @Override
    public void displayBehavior() {
        System.out.println("I´m a tiger behaviour");
    }
}
