package animal.petAnimal;

public class Dog extends PetAnimals {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice() {
        System.out.printf("Меня зовут %s и я говорю 'гав-гав'\n", getName());
    }
}
