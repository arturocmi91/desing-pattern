package Factory;

import java.lang.reflect.Type;

public class ThingFactory {

    public Thing createdThing(String type){

        if (type.equalsIgnoreCase("Animal")){


            return new Animal();


        } else if (type.equalsIgnoreCase("Human")) {
            return new Human();
        }else {
            return null;
        }

    }
}
