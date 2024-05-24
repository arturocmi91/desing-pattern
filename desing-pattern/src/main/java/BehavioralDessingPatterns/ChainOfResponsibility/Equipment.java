package BehavioralDessingPatterns.ChainOfResponsibility;

public class Equipment {
    private Actuator actuator;

    public Equipment(Actuator actuator) {
        this.actuator = actuator;
    }

    public Actuator getActuator() {
        return actuator;
    }

    public Equipment setActuator(Actuator actuator) {
        this.actuator = actuator;
        return this;
    }
    public void chainActuate(HomeAppliance homeAppliance){
        System.out.println("Actua en : " + homeAppliance.getTypeHomeAppliance().name().toLowerCase());
        actuator.actuate(homeAppliance);

    }

}
