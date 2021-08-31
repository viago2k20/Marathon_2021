public class Cat implements Activity {
    private final String name;
    private boolean catStatus = true;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean getStatus() {
        return catStatus;
    }

    @Override
    public void run(double distance) {
        double catCanRun = (50 + 200 * Math.random());
        if (distance <= 0.0) {
            System.out.println("Неверный параметр!");
        }
        if (catCanRun >= distance) {
            System.out.println(getName() + " успешно пробежал!");
            System.out.printf(getName() + " пробежал " + "%.0f \n", catCanRun);
            System.out.println("Дистанция " + distance);
        }
        if (catCanRun < distance) {
            catStatus = false;
            System.out.println(getName() + " не смог пробежать!");
        }

    }


    @Override
    public void jump(double high) {
        double catCanJump = (0.2 + 0.9 * Math.random());
        if (high <= 0) {
            System.out.println("Неверный параметр!");
        }
        if (catCanJump >= high) {
            System.out.println(getName() + " смог перепрыгнуть!");
            System.out.printf(getName() + " прыгнул " + "%.2f \n", catCanJump);
            System.out.println("Высота " + high);
        }
        if (catCanJump < high) {
            catStatus = false;
            System.out.println(getName() + " не смог перепрыгнуть!");
        }

    }

}
