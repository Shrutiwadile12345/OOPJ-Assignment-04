class SalaryException {

    public static void main(String args[]) {
        int bonus = 10000;
        int employees = 0;   

        distributeBonus(bonus, employees);  
    }

    private static void distributeBonus(int bonus, int employees) {
        try {
            int share = bonus / employees;
            System.out.println("Each employee gets: " + share);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero not allowed!");
        }
    }
}
