package StructuralDesingPatterns.Decoretor.Decorator;

import StructuralDesingPatterns.Decoretor.Service.Service;

public abstract class ServiceDecorator implements Service {
    protected Service service;

    public ServiceDecorator(Service service) {
        this.service = service;
    }

    @Override
    public void loadData() {

        service.loadData();

    }
}
