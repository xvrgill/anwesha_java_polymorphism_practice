public class Executive extends Employee {
    private double bonus;

    public Executive(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.bonus = 0;
    }

    public void awardBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double pay() {
        double payment = super.pay() + bonus;
        this.bonus = 0;
        return payment;
    }

    @Override
    public int vacation() {
        return 5;
    }
}