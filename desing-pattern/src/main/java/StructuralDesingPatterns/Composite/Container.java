package StructuralDesingPatterns.Composite;

import java.util.ArrayList;

public class Container extends WarehouseItem{
    public Container(String name) {
        super(name, 0,0.0);
        items= new ArrayList<>();
    }

    @Override
    public void add(WarehouseItem warehouseItem) {
        items.add(warehouseItem);

    }

    @Override
    public void delete(WarehouseItem warehouseItem) {
        items.remove(warehouseItem);

    }

    @Override
    public int getQty() {

        int qtyResult= qty;
        for (WarehouseItem item: items) {
            qtyResult += item.getQty();
        }
        return qtyResult;
    }

    @Override
    public Double getValue() {

        Double valueResult= value;
        for (WarehouseItem item: items){
            valueResult += item.getValue();
        }
        return valueResult;
    }
}
