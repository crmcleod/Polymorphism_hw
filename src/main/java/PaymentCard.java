import java.util.ArrayList;
import java.util.Date;

public abstract class PaymentCard implements IChargeable {
    String cardNumber;
    Date expiryDate;
    int securityNumber;
    ArrayList<Double> charges;
    //Charging implies updating the list of charges

    public PaymentCard(String cardNumber, Date expiryDate, int securityNumber) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.securityNumber = securityNumber;
        charges = new ArrayList<Double>();
    }

    public double charge(double purchaseAmount) {
        this.charges.add(purchaseAmount + getTransactionCost(purchaseAmount));
        return purchaseAmount;
    }

    public int countCharges() {
        return this.charges.size();
    }
}
