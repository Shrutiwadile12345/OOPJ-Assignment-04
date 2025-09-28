class EmployeeData {
    public static void main(String[] args) {
      
        int n = 2;
        int[] salaries = {5000, 6000};

        //int index = 5;		// Invalid index (employee index change 0 to 5)
        int index = 0;    //Division by zero
		int hours = 0;  // working hours

        try {
            int salary = salaries[index];  // Outer try: handle invalid index

            try {
                int wage = salary / hours; // Inner try: handle division by zero
                System.out.println("Hourly wage: " + wage);
            } catch (ArithmeticException e) {
                System.out.println("Division by zero");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }
    }
}
