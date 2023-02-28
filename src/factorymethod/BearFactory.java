package factorymethod;

public class BearFactory extends AnimalFactory{
    @Override
    public Animal createAnimal(String color) {
        return new Bear(color);
    }
}
