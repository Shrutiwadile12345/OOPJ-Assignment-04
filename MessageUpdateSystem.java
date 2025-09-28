class MessageUpdateSystem{
  
     public static void main(String args[]){
	 
	 String originalText = "Old Notice";
	 String textToFind = "Old";
	 String replacementText = "Updated";
	 
	 StringBuffer sb = new StringBuffer(originalText);
	 
	 int start = sb.indexOf(textToFind);
	 if(start != -1){
		 
		 int end = start + textToFind.length();
		  sb.replace(start, end, replacementText);
		 
	 }
	 System.out.println(sb.toString());
	
	 
	 }
}