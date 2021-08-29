public class Treadmill implements Obstacle{
    private final double distance;
    private static final String name = "treadmill";

    public Treadmill(double distance){
        this.distance = distance;
    }

    public double getParameters(){
        return distance;
    }

    @Override
    public String gateName() {
        return name;
    }
}
