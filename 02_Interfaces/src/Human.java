public class Human implements Moves {
    private final String name;
    private boolean status = true;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean getStatus() {
        return status;
    }

    @Override
    public void run(double distance) {
        double humanCanRun = (900 + 2200 * Math.random());
        if (distance <= 0.0) {
            System.out.println("Неверный параметр!");
        }
        if (humanCanRun >= distance) {
            System.out.println(getName() + " успешно пробежал!");
            System.out.printf(getName() + " пробежал " + "%.0f \n", humanCanRun);
            System.out.println("Дистанция " + distance);
        }
        if (humanCanRun < distance) {
            status = false;
            System.out.println(getName() + " не смог пробежать!");
        }
    }

    @Override
    public void jump(double high) {
        double humanCanJump = (1.6 + 2.0 * Math.random());
        if (high <= 0) {
            System.out.println("Неверный параметр!");
        }
        if (humanCanJump >= high) {
            status = true;
            System.out.println(getName() + " смог перепрыгнуть!");
            System.out.printf(getName() + " прыгнул " + "%.2f \n", humanCanJump);
            System.out.println("Высота " + high);
        }
        if (humanCanJump < high) {
            status = false;
            System.out.println(getName() + " не смог перепрыгнуть!");
        }

    }
}
