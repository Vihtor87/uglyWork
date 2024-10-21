package animal;

public abstract class Animal  implements Voice {

    private static String name;
    private static int age;


    public Animal(String name, int age) {
        Animal.name = name;
        Animal.age = age;
    }

    public static String getName() {
        return name;
    }

    private void setName(String name) {
        Animal.name = name;
    }

    public static int getAge() {
        return age;
    }

    private void setAge(int age) {
        Animal.age = age;
    }

    public String getType() {
        return this.getClass().getName();
    }

    @Override
    public void voice() {}
}
