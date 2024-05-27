package BehavioralDessingPatterns.Command;

public class MoveFrontCommand implements ManualCommand{
    private PodDrive podDrive;

    public MoveFrontCommand(PodDrive podDrive){
        this.podDrive= podDrive;
    }


    @Override
    public void execute() {
        podDrive.moveFront();
    }
}
