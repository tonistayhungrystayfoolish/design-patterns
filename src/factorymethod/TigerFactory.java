package factorymethod;

public class TigerFactory extends AnimalFactory {


    @Override
    public Animal createAnimal(String color) {
        return new Tiger(color);
    }
}
