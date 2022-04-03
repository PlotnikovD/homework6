package homework6;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void swim(int swimDistance) {
        if (swimDistance < 10) {
            System.out.println(getName() + " проплыл " + swimDistance +" м.");
        } else {
            System.out.println(getName() + " не может проплыть больше 10 м.");
        }
    }

    @Override
    void run(int runDistance) {
        if(runDistance > 500) {
            System.out.println(getName() + " не может пробежать больше 500 м.");
        } else {
            System.out.println(getName() + " пробежал " + runDistance + " м.");
        }
    }
}


