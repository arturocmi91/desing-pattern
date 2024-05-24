package BehavioralDessingPatterns.ChainOfResponsibility;

public class SolenoidValveWater extends Actuator{
    public SolenoidValveWater() {
    }

    public SolenoidValveWater(Actuator next) {
        super(next);
    }

    @Override
    public void actuate(HomeAppliance homeAppliance) {
        if(homeAppliance.getTypeHomeAppliance().equals(TypeHomeAppliance.SHOWER_PIPE))
            System.out.println("Actuando flujo de Agua ");
        else if (hasNext())
            getNext().actuate(homeAppliance);
        else
            System.out.println("Actuación no encontrada ");
    }

}
