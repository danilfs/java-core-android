package Homework8;

public class Track implements Trap {
    private final int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public boolean overcome(Participant participant) {
        if (participant.run(this.length)) {
            System.out.printf("%s %s ran track of %dm.\n", participant.getClass().getSimpleName(), participant.getName(), length);
            return true;
        }
        System.out.printf("%s %s haven't ran track of %dm.\n", participant.getClass().getSimpleName(), participant.getName(), length);
        return false;
    }
}