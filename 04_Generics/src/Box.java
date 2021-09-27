import java.util.ArrayList;

public class Box<T extends Fruit> {

    private final ArrayList<T> box = new ArrayList<>();

    public void addFruit(T fruit) {
        box.add(fruit);
    }

    public float getWeight() {
        float weight = 0;
        for (int i = 0; i < box.size(); i++) {
            weight += box.get(i).getWeight();
        }
        return weight;
    }

    public boolean compare(Box<?> fruit) {
        return this.getWeight() == fruit.getWeight();
    }


    public void shift(Box<T> anotherBox) {
        anotherBox.box.addAll(this.box);
        this.box.clear();
    }

    @Override
    public String toString() {
        return this.box.toString() + " вес коробки " + getWeight();
    }
}
