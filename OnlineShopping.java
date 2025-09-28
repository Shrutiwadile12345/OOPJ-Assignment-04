class OnlineShopping {
    public static void main(String[] args) {
       
        int quantity = 0;  // can trigger arithmetic exception
        int n = 3;         // number of products
        double[] prices = {299.99, 499.99, 199.99};
        //int productIndex = 5;  // invalid index → triggers ArrayIndexOutOfBoundsException
        int productIndex = 1;   //For arithmetic Exception
        try {
            
            double price = prices[productIndex]; // Outer try: access product price

            try {
               
                double total = quantity * price;  // Inner try: calculate total price
                if (quantity == 0) {
                    throw new ArithmeticException();
                }
                System.out.println("Total price: " + total);
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception caught");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception");
        }
    }
}
