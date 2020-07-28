public interface IChargeable {
    double getTransactionCost(double purchaseAmount);
    double charge(double purchaseAmount);
}
