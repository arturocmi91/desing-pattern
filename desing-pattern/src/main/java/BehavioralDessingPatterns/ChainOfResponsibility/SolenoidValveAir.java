package BehavioralDessingPatterns.ChainOfResponsibility;

public class SolenoidValveAir extends Actuator{
    public SolenoidValveAir() {
    }

    public SolenoidValveAir(Actuator next) {
        super(next);
    }

    @Override
    public void actuate(HomeAppliance homeAppliance) {
        if(homeAppliance.getTypeHomeAppliance().equals(TypeHomeAppliance.VENTILATION))
            System.out.println("Actuando flujo de Aire ");
        else if (hasNext())
            getNext().actuate(homeAppliance);
        else
            System.out.println("Actuación no encontrada ");
    }


}
