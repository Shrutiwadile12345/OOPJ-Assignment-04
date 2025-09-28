class PaymentProcessing{

     public static void main(String args[]){
	 
	 String amountAsString = "1000";
	 int additionalAmountToAdd = 500;
	 
	  int amount  = Integer.parseInt(amountAsString);
	  int total = amount + additionalAmountToAdd;
	  
	  System.out.println(amountAsString + " + " + additionalAmountToAdd + " = " + total);
	 
	 }


}