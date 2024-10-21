import animal.petAnimal.Cat;
import animal.petAnimal.Dog;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Васька", 3);
        Dog dog = new Dog("Рекс", 6);

        cat.addComandPet("принеси", "выполняю команду принеси");
        cat.addComandPet("брысь", "убегаю!");

        System.out.println(cat.getComandPet());

    }
}