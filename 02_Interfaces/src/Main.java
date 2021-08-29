public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Димон");
        Human human2 = new Human("Петр");

        Cat cat1 = new Cat("Барсик");

        Robot robot1 = new Robot("Atlas");

        Obstacle wall1 = new Wall(0.3);
        Obstacle wall2 = new Wall(0.5);
        Obstacle wall3 = new Wall(2.0);
        Obstacle wall4 = new Wall(1.2);
        Obstacle wall5 = new Wall(1.0);

        Obstacle treadmill1 = new Treadmill(2100.0);
        Obstacle treadmill2 = new Treadmill(900.0);
        Obstacle treadmill3 = new Treadmill(1500.0);
        Obstacle treadmill4 = new Treadmill(3000.0);
        Obstacle treadmill5 = new Treadmill(2000.0);


        Moves[] participants = {human1, human2, cat1, robot1, human2};
        Obstacle[] obstacles = {wall1, wall2, wall3, wall4, wall5, treadmill1, treadmill2, treadmill3, treadmill4, treadmill5};

        for (Moves participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if (obstacle.gateName().equals("wall")) {
                    participant.jump(obstacle.getParameters());
                }
                if (obstacle.gateName().equals("treadmill")) {
                    participant.run(obstacle.getParameters());
                }
                if (!participant.getStatus()) {
                    System.out.println("-*****-");
                    break;
                }
                System.out.println("-===-");
            }
        }
    }
}
