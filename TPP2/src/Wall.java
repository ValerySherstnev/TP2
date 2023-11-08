public class Wall implements Challenge {
    private int wallHeight;

    public Wall(WallHeight wallHeight) {
        this.height = wallHeight.getHeight();
        this.title = wallHeight.getTitle();
    }

    int height;
    String title;

    @Override
    public boolean isCanR(ParticipantRun p) {
        return false;
    }

    public boolean isCanJ(ParticipantJump p) {
        if (p.jump(height))
            return true;
        else
            return false;


    }

}
