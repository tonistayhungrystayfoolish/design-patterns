package factorymethod;

public class Bear implements Animal{

    public Bear(String color){
        System.out.println("Im a bear with color"+color);
    }
    @Override
    public void displayBehavior() {
        System.out.println("I´m a bear behaviour");
    }
}
