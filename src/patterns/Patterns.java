package patterns;

public class Patterns {

    public static void main(String[] args) {
        InvoiceFacade invoice = new InvoiceFacadeSingleton().getInstance();
        String client = invoice.getClient("12345678900");
        String bill = invoice.createBill(client, 400.00);
        invoice.dispatchContact(client, bill);
    }
    
}
