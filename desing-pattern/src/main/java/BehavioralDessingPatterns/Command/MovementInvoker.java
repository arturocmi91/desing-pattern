package BehavioralDessingPatterns.Command;

import java.util.HashMap;

public class MovementInvoker {
    private HashMap<Character,ManualCommand > manualCommands= new HashMap<>();
    private PodDrive podDrive;

    public MovementInvoker(PodDrive podDrive) {
        this.podDrive = podDrive;
        manualCommands.put('w',new MoveFrontCommand(podDrive));
        manualCommands.put('s',new MoveBackCommand(podDrive));
        manualCommands.put('d',new MoveRightCommand(podDrive));
        manualCommands.put('a',new MoveLeftCommand(podDrive));
        manualCommands.put('u',new ElevatedTestingCommand(podDrive));
    }

    public void move(char c){
        if(!manualCommands.containsKey(c))
            System.out.println("Comando no existente ");
        else
            manualCommands.get(c).execute();
    }


}
