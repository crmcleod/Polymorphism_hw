import java.util.Date;

public class CreditCard extends PaymentCard {

    double creditLimit;
    double customerRiskMultiplier;

    public CreditCard(String cardNumber, Date expiryDate, int securityNumber, double creditLimit, double customerRiskMultiplier) {
        super(cardNumber, expiryDate, securityNumber);
        this.creditLimit = creditLimit;
        this.customerRiskMultiplier = customerRiskMultiplier;
    }

    public double getTransactionCost(double purchaseAmount) {
        return 0.02 * purchaseAmount;
    }


}
