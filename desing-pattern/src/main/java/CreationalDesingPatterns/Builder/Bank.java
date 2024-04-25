package Builder;


public class Bank {
    private String name;
    private int qtyEmployees;
    private Double found;
    private String address;
    private String web;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQtyEmployees() {
        return qtyEmployees;
    }

    public void setQtyEmployees(int qtyEmployees) {
        this.qtyEmployees = qtyEmployees;
    }

    public Double getFound() {
        return found;
    }

    public void setFound(Double found) {
        this.found = found;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }
/// Metodo  public static Encargado de llamar a BankBuilder como buider y asi generar dentro BankBuilder  la
// instacia correspondiente
    public static BankBuilder builder(){
        return  new BankBuilder();
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", qtyEmployees=" + qtyEmployees +
                ", found=" + found +
                ", address='" + address + '\'' +
                ", web='" + web + '\'' +
                '}';
    }

}
