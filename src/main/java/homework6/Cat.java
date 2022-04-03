package homework6;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void swim(int swimDistance) {
        System.out.println(getName() + " не умеет плавать");
    }

    @Override
    void run(int runDistance) {
        if(runDistance > 200) {
            System.out.println(getName() + " не может пробежать больше 200 м.");
        } else {
            System.out.println(getName() + " пробежал " + runDistance + " м.");
        }
    }
}
