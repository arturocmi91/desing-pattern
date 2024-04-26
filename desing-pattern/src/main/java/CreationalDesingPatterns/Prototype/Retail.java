package CreationalDesingPatterns.Prototype;

public class Retail extends Customer {
    private Double discount;

    public Retail(String name, String company, Integer qty, Double invoice, Double discount) {
        super(name, company, qty, invoice);
        this.discount = discount;
    }

    public Retail(Retail retail) {
        super(retail);
        if (retail != null) {
            setDiscount(retail.getDiscount());
        }
    }

    @Override
    public Customer clone() {
        return new Retail(this);
    }

    public Double getDiscount() {
        return discount;
    }

    public Retail setDiscount(Double discount) {
        this.discount = discount;
        return this;
    }

    @Override
    public String toString() {
        return "Retail{" +
                "discount=" + discount +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", qty=" + qty +
                ", invoice=" + invoice +
                '}';
    }
}
