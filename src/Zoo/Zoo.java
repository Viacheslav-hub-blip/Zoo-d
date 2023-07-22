package Zoo;

import Animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();

    public String addNewAnimal(Animal newAnimal){
        animals.add(newAnimal);
        return "добавлено";
    }

}
