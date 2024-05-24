package StructuralDesingPatterns.Proxy;

import java.io.*;
import java.util.Date;

public class ActionImp implements Action{
    private  Stats stats;

    public Stats getStats(){
        return stats;
    }
    public void setStats(Stats stats){
        this.stats= stats;
    }

    @Override
    public void save(String name) {
        try {
            writeObject(name);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public Stats load(String name) {
        Stats stats= null;
        try {
            stats= (Stats) readObject(name);
            setStats(stats);
            return  stats;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
   public void newAction(String name){
        File file= new File(name);
        Stats stats=new Stats(name,1,0,0);
        stats.setCreatedAct(new Date());
        stats.setLastAct(new Date());
        setStats(stats);
       try {
           file.createNewFile();
           writeObject(name);
       } catch (IOException e) {
           throw new RuntimeException(e);
       }

   }

    private void writeObject(String name) throws IOException {
        // Se abre un flujo de salida de archivos para escribir en el archivo con el nombre proporcionado
        FileOutputStream fos = new FileOutputStream(name);
        // Se abre un flujo de objetos de salida para escribir objetos Java en el flujo de salida de archivos
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        // Se escribe el objeto Stats en el flujo de objetos de salida
        oos.writeObject(getStats());
        // Se asegura que todos los datos se escriban en el flujo de salida de archivos
        oos.flush();
        // Se cierra el flujo de objetos de salida para liberar los recursos
        oos.close();
        // Se asegura que todos los datos se escriban en el flujo de salida de archivos
        fos.flush();
        // Se cierra el flujo de salida de archivos para liberar los recursos
        fos.close();

    }
    private Object readObject(String name) throws IOException, ClassNotFoundException {
        // Se abre un flujo de entrada de archivos para leer del archivo con el nombre proporcionado
        FileInputStream fis = new FileInputStream(name);
        // Se abre un flujo de objetos de entrada para leer objetos Java del flujo de entrada de archivos
        ObjectInputStream ois = new ObjectInputStream(fis);
        // Se lee el objeto Stats del flujo de objetos de entrada
        Object stats = ois.readObject();
        // Se cierra el flujo de objetos de entrada para liberar los recursos
        ois.close();
        // Se cierra el flujo de entrada de archivos para liberar los recursos
        fis.close();
        // Se devuelve el objeto Stats leído del archivo
        return stats;
    }
}
