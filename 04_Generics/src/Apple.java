public class Apple extends Fruit {

    private static int count;

    public Apple(){
        setName("Apple " + ++count);
    }

    @Override
    float getWeight() {
        return 1.0f;
    }

    @Override
    public String toString() {
        return getName();
    }
}
