package BehavioralDessingPatterns.ChainOfResponsibility;

public class TestChainOfResponsibility {
    public static void main(String[] args) {
        HomeAppliance homeAppliance= new HomeAppliance(TypeHomeAppliance.GAS_OVEN);
        Equipment equipment = new Equipment(new SolenoidValveWater(new SolenoidValveAir(new SolenoidValveGas())));
        equipment.chainActuate(homeAppliance);

    }
}
