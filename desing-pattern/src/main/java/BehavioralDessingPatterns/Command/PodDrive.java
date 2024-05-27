package BehavioralDessingPatterns.Command;

public class PodDrive {
    private int posX;
    private int posY;
    private int posZ;
    private int HydraulicJackTest;

    public PodDrive(int posX, int posY, int posZ) {
        this.posX = posX;
        this.posY = posY;
        this.posZ = posZ;

    }

    public void moveFront() {
        posY++;
        System.out.println("Position Y: " + posY);
    }

    public void moveBack() {
        posY--;
        System.out.println("Position Y : " + posY);
    }

    public void moveRight() {
        posX++;
        System.out.println("Position X : " + posX);
    }

    public void moveLeft() {
        posX--;
        System.out.println("Position X : " + posX);
    }

    public void upThePlatformTest() {
        posZ = posZ + 2;
        System.out.println("Prueba Hidrulica : " + posZ);
        try {
            Thread.sleep(4000);
            posZ = 0;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Prueba Hidrulica : " + posZ);


    }


}
