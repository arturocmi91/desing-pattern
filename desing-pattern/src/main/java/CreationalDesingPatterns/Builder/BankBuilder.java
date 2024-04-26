package CreationalDesingPatterns.Builder;

public class BankBuilder {
    private String name;
    private int qtyEmployees;
    private Double found;
    private String address;
    private String web;

    public String getName() {
        return name;
    }

    public int getQtyEmployees() {
        return qtyEmployees;
    }

    public Double getFound() {
        return found;
    }

    public String getAddress() {
        return address;
    }

    public String getWeb() {
        return web;
    }

    //Los Setter devuenlven la misma clase
    public BankBuilder name(String name) {
        this.name = name;
        return this;
    }

    public BankBuilder qtyEmployees(int qtyEmployees) {
        this.qtyEmployees = qtyEmployees;
        return this;
    }

    public BankBuilder found(Double found) {
        this.found = found;
        return this;
    }

    public BankBuilder address(String address) {
        this.address = address;
        return this;
    }

    public BankBuilder web(String web) {
        this.web = web;
        return this;
    }
    //Metodo publico encargado de construir (armar) la clase Bank dentro del la clase builder
    public Bank build(){
        Bank bank= new Bank();
        bank.setName(getName());
        bank.setQtyEmployees(getQtyEmployees());
        bank.setFound(getFound());
        bank.setAddress(getAddress());
        bank.setWeb(getWeb());
        return bank;
    }
}
