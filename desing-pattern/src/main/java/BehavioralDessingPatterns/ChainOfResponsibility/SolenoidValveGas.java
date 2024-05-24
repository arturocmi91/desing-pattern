package BehavioralDessingPatterns.ChainOfResponsibility;

public class SolenoidValveGas extends Actuator{
    public SolenoidValveGas() {
    }

    public SolenoidValveGas(Actuator next) {
        super(next);
    }
    @Override
    public void actuate(HomeAppliance homeAppliance) {
        if(homeAppliance.getTypeHomeAppliance().equals(TypeHomeAppliance.GAS_OVEN))
            System.out.println("Actuando flujo de Gas ");
        else if (hasNext())
            getNext().actuate(homeAppliance);
        else
            System.out.println("Actuación no encontrada ");
    }
}
