package CreationalDesingPatterns.Prototype;

public abstract  class Customer {
    protected String name;
    protected String company;
    protected Integer qty;
    protected Double invoice;

    public Customer(String name, String company, Integer qty, Double invoice) {
        this.name = name;
        this.company = company;
        this.qty = qty;
        this.invoice = invoice;
    }

    public Customer(Customer customer) {
        if (customer != null){
            setName(customer.getName());
            setCompany(customer.getCompany());
            setQty(customer.getQty());
            setInvoice(customer.getInvoice());
        }
    }
    public abstract Customer clone();


    public String getName() {
        return name;
    }

    public Customer setName(String name) {
        this.name = name;
        return this;
    }

    public String getCompany() {
        return company;
    }

    public Customer setCompany(String company) {
        this.company = company;
        return this;
    }

    public Integer getQty() {
        return qty;
    }

    public Customer setQty(Integer qty) {
        this.qty = qty;
        return this;
    }

    public Double getInvoice() {
        return invoice;
    }

    public Customer setInvoice(Double invoice) {
        this.invoice = invoice;
        return this;
    }
}
