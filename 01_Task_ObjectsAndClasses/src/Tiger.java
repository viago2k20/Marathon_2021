public class Tiger extends  Animal{
    private final String name;
    private static int tigerCount;

    public Tiger(String name){
        this.name = name;
        tigerCount++;
    }

    public String getName(){
        return name;
    }

    public static int getCount() {
        return tigerCount;
    }

    @Override
    public void run(int num) {
        if (num > 0 && num <= 1000)
            System.out.println(getName() + " пробежал " + num + " м");
        else
            System.out.println(getName() + " смог пробежать 1000 м");
    }

    @Override
    public void swim(int num) {
        if (num > 0 && num <= 50)
            System.out.println(getName() + " проплыл " + num + " м");
        else
            System.out.println(getName() + " смог проплыть 50 м");
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                '}';
    }
}
