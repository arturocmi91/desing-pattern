package Factory;

public class Human implements Thing{

    @Override
    public void run() {

        System.out.println("Corre");

    }

    @Override
    public void jump() {
        System.out.println("Salta");

    }
}
