package Animals;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Camel extends Animal implements AnimalAbility{

    @Override
    public String voice() {
        return "Верблюююд";
    }

    @Override
    public String run() {
        return "бежит";
    }

    @Override
    public String sleep() {
        return "спит";
    }
}
