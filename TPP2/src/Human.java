public class Human implements ParticipantRun, ParticipantJump{
    private int maxHeight;
    private int maxLenght;
    String name;

    boolean Count = true;

    public Human(int maxHeight, int maxLenght, String name) {
        this.maxHeight = maxHeight;
        this.maxLenght = maxLenght;
        this.name = name;
    }

    public boolean run(int dist) {
        if (dist <= maxLenght) {
            System.out.println(this.name + " пробежал " + dist + " м");
            return true;
        }
        else if (Count){
            Count = false;
            return superRun(name);
        }
        else{
            System.out.println(name + " не смог пробежать " + dist +" и выбыл");
            return false;
        }
    }
    @Override
    public boolean jump(int height) {
        if (height<= maxHeight) {
            System.out.println(this.name+ " перепрыгнул " + height  +" м");
            return  true;
        }
        else {
            System.out.println(this.name+ " не смог перепрыгнуть " + height  +" м и выбывает");
            return false;
        }
    }



}
