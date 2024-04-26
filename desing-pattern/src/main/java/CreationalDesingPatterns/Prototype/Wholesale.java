package CreationalDesingPatterns.Prototype;

public class Wholesale extends Customer {

private String wholesaleCode ;

    public Wholesale(String name, String company, Integer qty, Double invoice, String wholesaleCode) {
        super(name, company, qty, invoice);
        this.wholesaleCode = wholesaleCode;
    }

    public Wholesale(Wholesale wholesale) {
        super(wholesale);
        if(wholesale!= null){
            setWholesaleCode(wholesale.getWholesaleCode());
        }

    }

    @Override
    public Customer clone() {
        return new Wholesale(this);
    }

    public String getWholesaleCode() {

        return wholesaleCode;
    }

    public Wholesale setWholesaleCode(String wholesaleCode) {
        this.wholesaleCode = wholesaleCode;
        return this;
    }

    @Override
    public String toString() {
        return "Wholesale{" +
                "wholesaleCode='" + wholesaleCode + '\'' +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", qty=" + qty +
                ", invoice=" + invoice +
                '}';
    }
}
