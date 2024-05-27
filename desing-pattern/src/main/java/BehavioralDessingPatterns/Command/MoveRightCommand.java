package BehavioralDessingPatterns.Command;

public class MoveRightCommand implements ManualCommand{
    private PodDrive podDrive;

    public MoveRightCommand(PodDrive podDrive){
        this.podDrive= podDrive;
    }


    @Override
    public void execute() {
        podDrive.moveRight();
    }
}
