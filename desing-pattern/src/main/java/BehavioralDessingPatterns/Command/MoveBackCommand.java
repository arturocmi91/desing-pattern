package BehavioralDessingPatterns.Command;

public class MoveBackCommand implements ManualCommand{
    private PodDrive podDrive;

    public MoveBackCommand(PodDrive podDrive){
        this.podDrive= podDrive;
    }


    @Override
    public void execute() {
        podDrive.moveBack();
    }
}
