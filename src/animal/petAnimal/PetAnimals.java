package animal.petAnimal;
import animal.Animal;

import java.util.HashMap;

public class PetAnimals extends Animal {

    private final HashMap<String, String> comandList = new HashMap<>();

    public PetAnimals(String name, int age) {
        super(name, age);
    }

    public void addComandPet(String name, String comand) {
        comandList.put(name, comand);
    }

    public HashMap<String, String> getComandPet() {
        return comandList;
    }
}
