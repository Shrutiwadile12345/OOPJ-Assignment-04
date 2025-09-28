class GreetingMessage{

     public static void main(String args[]){
	 
	 String initialText = "Hello ";
	 String textToInsert = "CDAC ";
	 int insertIndex = 6;
	 String textToAppend = "Java Student";
	 
	 StringBuilder sb = new StringBuilder(initialText);
	 
	 sb.insert(insertIndex, textToInsert);  // Insert "CDAC " at index 6
	 sb.append(textToAppend);
	 
	 String result = sb.toString();     // (Convert StringBuilder to String) Convert to String and print
     System.out.println(result);
	 
	 }

}