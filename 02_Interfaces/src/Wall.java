public class Wall implements Obstacle{
    private final double high;

    public Wall(double high){
        this.high = high;
    }

    @Override
    public void action(Activity p) {
        p.jump(high);
    }
}
