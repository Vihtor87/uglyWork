package animal.petAnimal;

public class Cat extends PetAnimals {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice() {
        System.out.printf("Меня зовут %s и я говорю 'мяу-мяу'\n", getName());
    }
}
