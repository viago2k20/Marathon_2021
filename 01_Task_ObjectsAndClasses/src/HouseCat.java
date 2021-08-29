public class HouseCat extends Animal {
    private static int catCount;

    public HouseCat(String name){
        setName(name);
        catCount++;
    }

    public static int getCount() {
        return catCount;
    }

    @Override
    public void run(int num) {
        if (num > 0 && num <= 200)
            System.out.println(getName() + " пробежал " + num + " м");
        else
            System.out.println(getName() + " смог пробежать 200 м");
    }

    @Override
    public void swim(int num) {
        System.out.println("Домашние коты не плавают!");
    }

    @Override
    public String toString() {
        return "HouseCat{" +
                "name='" + getName() + '\'' +
                '}';
    }
}
