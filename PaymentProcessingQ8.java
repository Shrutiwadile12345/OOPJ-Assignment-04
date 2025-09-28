class PaymentProcessingQ8 {
    static void processPayment() {
        try {
            // Simulate payment failure
            throw new Exception("Payment failed");
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            // Cleanup code always runs
            System.out.println("Cleanup done");
        }
    }

    public static void main(String[] args) {
        processPayment();
    }
}
