package CreationalDesingPatterns.Prototype;

public class TestPrototype {
    public static void main(String[] args) {
        Retail retail1 = new Retail("Juan", null, 54, 545.5, 0.5);
        Retail retail2 = (Retail) retail1.clone();

        System.out.println("============MINORISTA=============");

        System.out.println(retail1);
        System.out.println(retail2);
        System.out.println("=========================");
        retail2.setName("Arturo");
        System.out.println(retail1);
        System.out.println(retail2);

        Wholesale wholesale = new Wholesale("Juan", null, 54, 545.5, "TDG");
        Wholesale wholesale2= (Wholesale) wholesale.clone();

        System.out.println("============MAYORISTAS=============");

        System.out.println(wholesale);
        System.out.println(wholesale2);
        System.out.println("=========================");
        wholesale2.setName("Arturo");
        wholesale2.setWholesaleCode("ART");

        System.out.println(wholesale);
        System.out.println(wholesale2);

    }
}
