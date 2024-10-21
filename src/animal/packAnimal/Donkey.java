package animal.packAnimal;

public class Donkey extends PackAnimals {

    public Donkey(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice() {
        System.out.printf("Меня зовут %s и я говорю!) Я говорящий осёл)\n", getName());
    }
}
