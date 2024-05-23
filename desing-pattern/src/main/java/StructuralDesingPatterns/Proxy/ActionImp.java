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
        FileOutputStream fos= new FileOutputStream(name);
        ObjectOutputStream oos= new ObjectOutputStream(fos);
        oos.writeObject(getStats());
        oos.flush();
        oos.close();
        fos.flush();
        fos.close();
    }
    private Object readObject(String name) throws IOException, ClassNotFoundException {
        FileInputStream fis= new FileInputStream(name);
        ObjectInputStream ois= new ObjectInputStream(fis);
        Object stats= ois.readObject();
        ois.close();
        fis.close();
        return stats;
    }
}
