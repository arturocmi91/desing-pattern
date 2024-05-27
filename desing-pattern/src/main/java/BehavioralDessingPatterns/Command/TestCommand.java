package BehavioralDessingPatterns.Command;

import java.util.Locale;
import java.util.Scanner;

public class TestCommand {
    public static void main(String[] args) {

        PodDrive podDrive = new PodDrive(0, 0, 0);
        MovementInvoker invoker = new MovementInvoker(podDrive);
        Scanner sc = new Scanner(System.in);
        char c = sc.next().trim().toLowerCase().charAt(0);
        while (c!= 'q'){
            invoker.move(c);
            c = sc.next().trim().toLowerCase().charAt(0);
        }

    }
}
