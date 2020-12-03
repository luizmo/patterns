package patterns;

public class InvoiceFacade {
    protected InvoiceFacade(){}
    
    public String getClient(String client){
        return client;
    }
    public String createBill(String client, double value){
    }
    public void dispatchContact(String client, String bill){
        String foundClient = getClient(client);
        if(foundClient != null){
            System.out.print("Caro Sr." + "," + bill);
        }
    }
}
