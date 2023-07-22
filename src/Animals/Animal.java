package Animals;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Animal {
    private int age;
    private String Name;
    private AnimalType type;
    private ZooDepartment department;
    private AnimalStates state;
}
