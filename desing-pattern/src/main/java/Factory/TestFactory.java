package Factory;

import java.util.Scanner;

public class TestFactory {


    public static void main(String[] args) {

        //Se Fabrica la instancia (Animal/Humano)

        ThingFactory thingFactory= new ThingFactory();
        Scanner scanner= new Scanner(System.in);

        System.out.println("¿Qué tipo de cosa quieres crear? (Animal/Human)");

        String thingType= scanner.nextLine();
        Thing thing= thingFactory.createdThing(thingType);





        thing.jump();
        thing.run();



    }

}