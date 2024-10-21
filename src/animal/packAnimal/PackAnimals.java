package animal.packAnimal;

import animal.Animal;

import java.util.HashMap;

public class PackAnimals extends Animal {

    private final HashMap<String, String> comandList = new HashMap<>();

    public PackAnimals(String name, int age) {
        super(name, age);
    }

    public void addComandPack(String name, String comand) {
        comandList.put(name, comand);
    }

    public HashMap<String, String> getComandPack() {
        return comandList;
    }
}
