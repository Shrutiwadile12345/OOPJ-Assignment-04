class DataProcessingCleanup{
 
     public static void main(String args[]){
	 
	 try{
	       throw new Exception("Invalid input");
	       
	 } catch(Exception e) {
	       System.out.println("Exception occurred: " + e.getMessage());
	 }
	 finally{
	    System.out.println("Data processing completed");
	 }
	 
	 }

}