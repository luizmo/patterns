package patterns;
import java.util.Date;

public class InvoiceFacade {
    Clock clock = new SystemClock();
    protected InvoiceFacade(){}
    
    public String getClient(String client){
        return client;
    }
    public String createBill(String client, double value){
        String foundClient = getClient(client);
        Date currentDay = clock.current().getTime();
        return "a fatura no valor de" + value + ", foi gerada para no seu cpf " + foundClient +  " no dia:" + currentDay +".";   
    }
    public void dispatchContact(String client, String bill){
        String foundClient = getClient(client);
        if(foundClient != null){
            System.out.print("Caro Sr." + "," + bill);
        }
    }
}
