package Zoo;

import Animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();
    private static Zoo instatnce;

    private Zoo() {

    }

    public static Zoo getInstance() {
        if (instatnce == null) {
            synchronized (Zoo.class) {
                if (instatnce == null) {
                    instatnce = new Zoo();
                }
            }
        }
        return instatnce;
    }

    public String addNewAnimal(Animal newAnimal) {
        animals.add(newAnimal);
        return "добавлено";
    }

    public String removeAnimal(Animal animal) {
        for (Animal anim : animals) {
            if (anim.equals(animal)) {
                animals.remove(anim);
                return "удалено";
            }
        }
        return "";
    }

    public int getCountAnimal() {
        return animals.size();
    }
}
