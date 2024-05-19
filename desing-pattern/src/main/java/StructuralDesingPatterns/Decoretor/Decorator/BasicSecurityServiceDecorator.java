package StructuralDesingPatterns.Decoretor.Decorator;

import StructuralDesingPatterns.Decoretor.Service.Service;

public class BasicSecurityServiceDecorator extends  ServiceDecorator {
    public BasicSecurityServiceDecorator(Service service) {
        super(service);
    }

    @Override
    public void loadData() {

        super.loadData();
        System.out.println("Capa Basica de Seguridad Activada");

    }
}
