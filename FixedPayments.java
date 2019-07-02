package AutoCalc;

public class FixedPayments {
    private final int BROKER_SERVICE = 250;
    private final double REGISTRATION = 600/26.1;
    private final double INSURANCE = 600/26.1;
    private final double FIXED_PAYMENTS = BROKER_SERVICE+REGISTRATION+INSURANCE;

    public double getFIXED_PAYMENTS() {
        return FIXED_PAYMENTS;
    }
}