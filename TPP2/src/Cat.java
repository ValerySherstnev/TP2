public class Cat implements ParticipantRun, ParticipantJump{
    int maxHeight;
    int maxLenght;
    String name;
    boolean Count = true;
    public Cat(int maxHeight, int maxLenght, String name) {
        this.maxHeight = maxHeight;
        this.maxLenght = maxLenght;
        this.name = name;
    }

    public boolean run(int dist) {
        if (dist <= maxLenght) {
            System.out.println("Кот " +this.name + " пробежал " + dist + " м");
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


    public boolean jump(int height) {
        if (height<= maxHeight) {
            System.out.println("Кот "+ this.name+ " перепрыгнул " + height  +" м");
            return true;
        }
        else {
            System.out.println("Кот "+ this.name+ " не смог перепрыгнуть " + height  +" м и выбывает");
            return false;
        }
    }

}
