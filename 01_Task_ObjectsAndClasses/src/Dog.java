public class Dog extends Animal {
    private final String name;
    private static int dogCount;


    public Dog(String name){
        this.name = name;
        dogCount++;
    }

    public String getName() {
        return name;
    }

    public static int getCount(){
        return dogCount;
    }

    @Override
    public void swim(int num){
        if (num > 0 && num <= 10)
            System.out.println(getName() + " проплыл " + num + " м");
        else
            System.out.println(getName() + " смог проплыть 10 м");
    }

    @Override
    public void run(int num) {
        if (num > 0 && num <= 500)
            System.out.println(getName() + " пробежал " + num + " м");
        else
            System.out.println(getName() + " смог пробежать 500 м");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
