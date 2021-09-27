public class Orange extends Fruit {

    private static int count;

    public Orange(){
        setName("Orange " + ++count);
    }

    @Override
    float getWeight() {
        return 1.5f;
    }

    @Override
    public String toString() {
        return getName();
    }
}
