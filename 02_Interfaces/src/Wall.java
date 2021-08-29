public class Wall implements Obstacle{
    private final double high;
    private static final String name = "wall";

    public Wall(double high){
        this.high = high;
    }

    public double getParameters(){
        return high;
    }

    @Override
    public String gateName() {
        return name;
    }
}
