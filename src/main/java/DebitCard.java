import java.util.Date;

public class DebitCard extends PaymentCard {

    int sortCode;
    int accountNumber;

    public DebitCard(String cardNumber, Date expiryDate, int securityNumber, int sortCode, int  accountNumber){
        super(cardNumber, expiryDate, securityNumber);
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
    }

    public double getTransactionCost(double purchaseAmount) {
        return 0.01 * purchaseAmount;
    }
}
