class AgeInput{

    public static void main(String args[]){
	
	String ageInput = "eighteen";
	
	try {
          int age = Integer.parseInt(ageInput);  // converting to integer
          System.out.println("Age entered: " + age);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }
	}
}