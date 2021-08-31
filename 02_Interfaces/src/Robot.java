public class Robot implements Activity {
    private final String name;
    private boolean status = true;

    public Robot(String name) {
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
        double robotCanRun = (2000 + 3000 * Math.random());
        if (distance <= 0.0) {
            System.out.println("Неверный параметр!");
        }
        if (robotCanRun >= distance) {
            System.out.println(getName() + " успешно пробежал!");
            System.out.printf(getName() + " пробежал " + "%.0f \n", robotCanRun);
            System.out.println("Дистанция " + distance);
        }
        if (robotCanRun < distance) {
            status = false;
            System.out.println(getName() + " не смог пробежать!");
        }
    }

    @Override
    public void jump(double high) {
        double robotCanJump = (1.7 + 2.5 * Math.random());
        if (high <= 0) {
            System.out.println("Неверный параметр!");
        }
        if (robotCanJump >= high) {
            System.out.println(getName() + " смог перепрыгнуть!");
            System.out.printf(getName() + " прыгнул " + "%.2f \n", robotCanJump);
            System.out.println("Высота " + high);
        }
        if (robotCanJump < high) {
            status = false;
            System.out.println(getName() + " не смог перепрыгнуть!");
        }
    }
}
