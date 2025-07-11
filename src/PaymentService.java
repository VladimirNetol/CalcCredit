public class PaymentService {
    public double creditPaymentService(double sum, double sumPayments) {
        double monthlyRate;
        double monthlyPayment;
        monthlyRate = 9.99 / 12 / 100;
        monthlyPayment = sum * (monthlyRate / (1 - Math.pow(1 + monthlyRate, -sumPayments)));
        return (int) monthlyPayment;
    }
}
