//Exam write a child class for a parent class

public class Commission extends Hourly {

    private double totalSales;
    private double commissionRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate,
            double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
        this.totalSales = 0;
    }

    public void AddSales(double sales) {
        this.totalSales += sales;
    }

    @Override
    public double pay() {
        double hourlyPay = super.pay();
        double commission = commissionRate * totalSales;
        return hourlyPay + commission;
    }
    
    @Override
    public String toString() {
        String result = super.toString();
        result += "Total sales" + totalSales;
        return result;
    }


}

