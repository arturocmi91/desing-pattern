package BehavioralDessingPatterns.Command;

public class MoveLeftCommand implements ManualCommand {
    private PodDrive podDrive;

    public MoveLeftCommand(PodDrive podDrive){
        this.podDrive= podDrive;
    }


    @Override
    public void execute() {
        podDrive.moveLeft();
    }
}
