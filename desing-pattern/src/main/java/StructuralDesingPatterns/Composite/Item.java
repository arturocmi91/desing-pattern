package StructuralDesingPatterns.Composite;

public class Item extends WarehouseItem{
    public Item(String name, Integer qty, Double value) {
        super(name, qty, value);
    }

    @Override
    public void add(WarehouseItem warehouseItem) {
        System.out.println("not items allowed");
    }

    @Override
    public void delete(WarehouseItem warehouseItem) {
        System.out.println("not items allowed");
    }

    @Override
    public int getQty() {
        return qty;
    }

    @Override
    public Double getValue() {
        return value;
    }
}
