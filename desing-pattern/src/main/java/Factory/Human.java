package Factory;

public class Human implements Thing{

    @Override
    public void run() {

        System.out.println("El Humano Corre");

    }

    @Override
    public void jump() {
        System.out.println("El Humano Salta");

    }
}
