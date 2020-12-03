package patterns;


public class InvoiceFacadeSingleton {
    private InvoiceFacade instance;
    public InvoiceFacade getInstance(){
        if(instance == null){
            instance = new InvoiceFacade();
        }
        return instance;
    }
}
