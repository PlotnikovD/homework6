package homework6;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void swim(int swimDistance);

    abstract void run(int runDistance);

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if(age < 0) {
            System.out.println("Возраст не может быть меньше 0");
        } else {
            this.age = age;
        }
    }
}


