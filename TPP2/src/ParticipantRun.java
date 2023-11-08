public interface ParticipantRun extends Participant {
    boolean run(int dist);
    default boolean superRun(String name) {
        System.out.println(name + " пробежал используя суперсилу");
        return true;
    }

}
