package animal.packAnimal;

public class Camel extends PackAnimals {

    public Camel(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice() {
        System.out.printf("Меня зовут %s и я говорю 'фыр-фыр'\n", getName());
    }
}
