public class Main {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();
        System.out.print("Ваш ежемесячный платеж составляет: ");
        System.out.println(service.creditPaymentService(1000000, 12));

        System.out.print("Ваш ежемесячный платеж составляет: ");
        System.out.println(service.creditPaymentService(1000000, 24));

        System.out.print("Ваш ежемесячный платеж составляет: ");
        System.out.println(service.creditPaymentService(1000000, 36));
    }
}
