package BehavioralDessingPatterns.ChainOfResponsibility;

public class HomeAppliance {
    private TypeHomeAppliance typeHomeAppliance;

    public HomeAppliance(TypeHomeAppliance typeHomeAppliance) {
        this.typeHomeAppliance = typeHomeAppliance;
    }

    public TypeHomeAppliance getTypeHomeAppliance() {
        return typeHomeAppliance;
    }

    public HomeAppliance setTypeHomeAppliance(TypeHomeAppliance typeHomeAppliance) {
        this.typeHomeAppliance = typeHomeAppliance;
        return this;
    }
}
