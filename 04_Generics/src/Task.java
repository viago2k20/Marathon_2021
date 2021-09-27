public class Task {
    public static void main(String[] args) {
        Box<Orange> orangeBox = new Box<Orange>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        Box<Apple> appleBox = new Box<Apple>();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

       // System.out.println(appleBox.getWeight());

        System.out.println(orangeBox.toString());
        System.out.println(appleBox.toString());

        System.out.println(orangeBox.compare(appleBox));

        Box<Apple> newAppleBox = new Box<Apple>();
        appleBox.shift(newAppleBox);
        System.out.println(appleBox.toString());

        System.out.println(newAppleBox.toString());


    }
}
