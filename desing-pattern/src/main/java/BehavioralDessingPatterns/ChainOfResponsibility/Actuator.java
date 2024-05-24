package BehavioralDessingPatterns.ChainOfResponsibility;

public abstract class Actuator {
    protected Actuator next;

    public Actuator() {
    }

    public Actuator(Actuator next) {
        this.next = next;
    }

    public Actuator getNext() {
        return next;
    }

    public Actuator setNext(Actuator next) {
        this.next = next;
        return this;
    }
    public  boolean hasNext(){
        return  getNext() != null;
    }
    public abstract void actuate(HomeAppliance homeAppliance);
}
