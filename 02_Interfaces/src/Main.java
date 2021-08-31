public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Димон");
        Human human2 = new Human("Петр");

        Cat cat1 = new Cat("Барсик");

        Robot robot1 = new Robot("Atlas");

        Wall wall1 = new Wall(0.3);
        Wall wall2 = new Wall(0.5);
        Wall wall3 = new Wall(2.0);
        Wall wall4 = new Wall(1.2);
        Wall wall5 = new Wall(1.0);

        Treadmill treadmill1 = new Treadmill(2100.0);
        Treadmill treadmill2 = new Treadmill(900.0);
        Treadmill treadmill3 = new Treadmill(1500.0);
        Treadmill treadmill4 = new Treadmill(3000.0);
        Treadmill treadmill5 = new Treadmill(2000.0);


        Activity[] participants = {human1, human2, cat1, robot1, human2};
        Obstacle[] obstacles = {wall1, wall2, wall3, wall4, wall5, treadmill1, treadmill2, treadmill3, treadmill4, treadmill5};


        for(int i=0; i < participants.length; i++){
            for (int j=0; j< obstacles.length; j++) {
                obstacles[j].action(participants[i]);
                System.out.println("***");
                if(!participants[i].getStatus()){
                    break;
                }
            }
            System.out.println("-----");
        }

    }
}
