package factorymethod;

public class DogFactory extends AnimalFactory {

    @Override
    public Animal createAnimal(String color) {
        return new Dog(color);
    }
}
