package BehavioralDessingPatterns.Command;

public class ElevatedTestingCommand implements ManualCommand{
    private PodDrive podDrive;

    public ElevatedTestingCommand(PodDrive podDrive){
        this.podDrive= podDrive;
    }


    @Override
    public void execute() {
        podDrive.upThePlatformTest();
    }
}
