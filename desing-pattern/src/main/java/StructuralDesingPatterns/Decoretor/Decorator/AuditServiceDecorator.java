package StructuralDesingPatterns.Decoretor.Decorator;

import StructuralDesingPatterns.Decoretor.Service.Service;

public class AuditServiceDecorator extends ServiceDecorator {
    public AuditServiceDecorator(Service service) {
        super(service);
    }

    @Override
    public void loadData() {

        super.loadData();
        System.out.println("Activado Sistema de auditoria");
    }
}
