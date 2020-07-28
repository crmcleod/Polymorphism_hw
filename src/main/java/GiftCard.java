public class GiftCard implements IChargeable{
    double amount;
    String vendor;


    public GiftCard(double amount, String vendor) {
        this.amount = amount;
        this.vendor = vendor;
    }

    public double getTransactionCost(double purchaseAmount) {
        return 0;
    }

    public double charge(double purchaseAmount) {
        this.amount -= purchaseAmount;
        return purchaseAmount;
    }

    public double getAmount(){
        return amount;
    }
}
