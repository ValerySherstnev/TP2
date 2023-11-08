public class Main {
    public static void main(String[] args) {
        Participant[] participants = {
                new Human(2, 600, "Гриша"),
                new Robot(5, 450, "Чаппи"),
                new Robot(5, 450, "Рик"),
                new Cat(1, 100, "Матроскин"),
        };

        Challenge[] challenges = {
                new RunningRoad(RoadLenght.HIGH),
                new RunningRoad(RoadLenght.HIGH),
                new RunningRoad(RoadLenght.LOW),
                new Wall(WallHeight.LOW),
                new Wall(WallHeight.MEDIUM),
                new Wall(WallHeight.HIGH),
        };
        for(Participant p: participants) {
            for (Challenge c: challenges) {
                if (!c.isCanR((ParticipantRun) p) & !c.isCanJ((ParticipantJump) p))
                    break;
            }
        }
    }
}