import Animals.*;
import Zoo.Zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Camel camel = Camel.builder().Name("Slava").type(AnimalType.CAMEL).department(ZooDepartment.EAST).age(15).state(AnimalStates.None).build();
        System.out.println(camel);
        System.out.println(zoo.addNewAnimal(camel));

    }
}
