public class Treadmill implements Obstacle{
    private final double distance;

    public Treadmill(double distance){
        this.distance = distance;
    }

    @Override
    public void action(Activity p) {
        p.run(distance);
    }
}
