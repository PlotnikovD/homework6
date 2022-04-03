package homework6;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Василий", 12);
        Dog dog = new Dog("Барбос", 10);
        cat.setName("Васек");
        System.out.println(cat.getName());
        cat.setAge(-1);
        System.out.println(cat.getAge());

        dog.swim(9);
        dog.run(400);
        cat.run(140);
        cat.swim(50);
    }
}
