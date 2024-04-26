package CreationalDesingPatterns.Builder;

public class TestBuilder {
    public static void main(String[] args){


        Bank banesco= Bank.builder()   /* >>>>  llama a BankBuilder "clase constructora"
              //Setter de BankBuilder          y esta devuelve sus setter (que a se vez devuelven su clase constructura)*/
                .name("Banesco Maracay")
                .qtyEmployees(130)
                .found(1454646.25)
                .address("Av Bolivar N 89")
                .web("www.Banesco.ag")
                .build();
        System.out.println(banesco.toString());

    }
}
