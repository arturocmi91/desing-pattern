package CreationalDesingPatterns.Singleton;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    // Atributo que almacena la dirección IP del cliente
    private String ip;
    // Instancia única del carrito de compras
    private static volatile ShoppingCart instance;// Volatile garantiza visibilidad entre hilos
    // Lista de ítems en el carrito de compras
    private List<String> items;
    // Constructor privado para evitar instanciación externa
    private ShoppingCart(String ip){
        // Simular una operación que toma tiempo
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        // Inicializar la dirección IP y la lista de ítems

        this.ip=ip;

        items= new ArrayList<>();
    }
    // Método estático para obtener la instancia del carrito de compras de manera sincronizada
    public  static synchronized   ShoppingCart getShopping(String ip){
        // Si la instancia no ha sido creada, crear una nueva (sincronizado para manejar concurrencia)
        if(instance == null){
            instance= new ShoppingCart(ip);
        }
        return instance;
    }

    public  void addItem(String item){
       items.add(item);
    }

    public void displayItems(){
        for (String item: items){
            System.out.println("- "+ item);
        }
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "ip='" + ip + '\'' +
                ", items=" + items +
                '}';
    }
}
