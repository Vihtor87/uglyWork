package animal.petAnimal;

public class Hamster extends PetAnimals {

    public Hamster(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice() {
        System.out.printf("Меня зовут %s и я говорю???\n", getName());
    }
}
