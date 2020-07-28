import java.util.ArrayList;

public class OnlineAccount {
    String name;
    ArrayList<IChargeable> paymentMethods;
    ReportingSoftware reportingSoftware;

    public OnlineAccount(String name){
        this.paymentMethods = new ArrayList<IChargeable>();
        this.reportingSoftware  = new ReportingSoftware();
    }

    public void chargeCustomer(IChargeable paymentMethod, double purchaseAmount){
       reportingSoftware.addTransaction(paymentMethod.charge(purchaseAmount));
    }
}
