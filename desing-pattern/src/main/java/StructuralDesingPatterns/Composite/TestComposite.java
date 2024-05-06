package StructuralDesingPatterns.Composite;

public class TestComposite {
    public static void main(String[] args) {
        //Creamos Ubicaciones
        //Una ubicación Grande para  articulos grandes
        WarehouseItem largeInventory = new Container("LG01");
        // Ubicaciónes Pequeñas para  articulos pequeños
        WarehouseItem electricalInventory = new Container("SM01");
        WarehouseItem otherInventory = new Container("SM02");
        //Articulos pequeños
        WarehouseItem item001 = new Item("Bombillos", 2, 10.2);
        WarehouseItem item002 = new Item("Fundas", 10, 10.2);

        electricalInventory.add(item001);
        otherInventory.add(item002);


        WarehouseItem motor = new Item("motor", 2, 1000.0);
        largeInventory.add(motor);

        System.out.println("Large Inventory total value " + "\n" + largeInventory.getValue() );
        System.out.println("====================================================== ");
        System.out.println("Large Inventory total qty " + "\n" + largeInventory.getQty() );
        System.out.println("====================================================== ");
        System.out.println("Smalls Inventory total qty " + "\n" + (electricalInventory.getQty() + otherInventory.getQty()));

    }
}
