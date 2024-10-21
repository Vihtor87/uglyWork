package animal.packAnimal;

public class Horse extends PackAnimals {

    public Horse(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice() {
        System.out.printf("Меня зовут %s и я говорю 'иго-го'\n", getName());
    }
}
