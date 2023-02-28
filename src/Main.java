import factorymethod.AnimalFactory;
import factorymethod.BearFactory;
import factorymethod.DogFactory;
import factorymethod.TigerFactory;

/**g
 * Factory Method is a creational design pattern,
 * that provides an interface for creating objects in a superclass,
 * but allows subclasses to alter the type of objects that will be created.
 */
public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory;

        //Dog
        animalFactory = new DogFactory();
        animalFactory.createAndDisplayAnimal("Brown");

        //Tiger
        animalFactory = new TigerFactory();
        animalFactory.createAndDisplayAnimal("Yellow and black");


        //Bear
        animalFactory = new BearFactory();
        animalFactory.createAndDisplayAnimal("Black");
    }
}
