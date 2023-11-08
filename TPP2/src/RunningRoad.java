public class RunningRoad implements Challenge {

    String name;

    public RunningRoad(RoadLenght roadLenght) {
        this.name = roadLenght.getTitle();
        this.roadLength = roadLenght.getLenght();
    }

    int roadLength;


    public boolean isCanR(ParticipantRun p) {
        if (p.run(roadLength))
            return true;
        else
            return false;


    }

    @Override
    public boolean isCanJ(ParticipantJump p) {
        return false;
    }

}
