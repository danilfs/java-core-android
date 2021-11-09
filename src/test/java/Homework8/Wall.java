package Homework8;

public class Wall implements Trap {
    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Participant participant) {
        if (participant.jump(this.height)) {
            System.out.printf("%s %s jumped over wall of %dm.\n", participant.getClass().getSimpleName(), participant.getName(), height);
            return true;
        }
        System.out.printf("%s %s haven't jumped over wall of %dm.\n", participant.getClass().getSimpleName(), participant.getName(), height);
        return false;
    }
}
