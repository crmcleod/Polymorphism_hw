import java.util.ArrayList;

public class ReportingSoftware {
    ArrayList<Double> transactionCosts;

    public ReportingSoftware() {
        transactionCosts = new ArrayList<Double>();
    }

    public void addTransaction(double transactionCost){
        transactionCosts.add(transactionCost);
    }

    public int countTransactions() {
        return transactionCosts.size();
    }

    public double total() {
        double total = 0;
        for(Double cost : transactionCosts) {
            total += cost;
        }
        return total;
    }
}
