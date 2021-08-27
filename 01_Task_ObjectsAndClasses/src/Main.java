public class Main {
    public static void main(String[] args) {
        HouseCat houseCat = new HouseCat("Пират");
        HouseCat houseCat1 = new HouseCat("Муся");

        Dog dog = new Dog("Рекс");

        Tiger tiger = new Tiger("Mike");
        Tiger tiger1 = new Tiger("Sony");
        Tiger tiger2 = new Tiger("Шерхан");

        Animal[] list = {houseCat, houseCat1, dog, tiger, tiger1, tiger2};
        int runDistance;
        int swimDistance;

        System.out.println("-------");
        for (Animal animal : list) {
            runDistance = (int) (10 + 1200 * Math.random());
            swimDistance = (int) (5 + 100 * Math.random());
            animal.run(runDistance);
            animal.swim(swimDistance);
        }

        System.out.println("");
        System.out.println("Количество домашних кошек " + HouseCat.getCount());
        System.out.println("Количество собак " + Dog.getCount());
        System.out.println("Количество тигров " + Tiger.getCount());

    }
}
