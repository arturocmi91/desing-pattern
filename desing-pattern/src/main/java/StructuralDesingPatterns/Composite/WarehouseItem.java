package StructuralDesingPatterns.Composite;

import java.util.List;

public abstract class WarehouseItem {
    protected String name;
    protected int qty;
    protected  Double value;
    protected List<WarehouseItem> items;

    public WarehouseItem(String name, Integer qty, Double value) {
        this.name = name;
        this.qty = qty;
        this.value = value;
    }

    public abstract void add(WarehouseItem warehouseItem);
    public abstract void delete(WarehouseItem warehouseItem);
    public abstract int getQty();
    public abstract Double getValue();

}
