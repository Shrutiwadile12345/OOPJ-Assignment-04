class RemoveOutdatedInformation{
    
	public static void main(String args[]){
	
	String originalText = "CDAC Kharghar 2024";
	String exactSubstringToDelete = "2024";
	
	StringBuffer sb = new StringBuffer(originalText);
	
	int  start = sb.indexOf(exactSubstringToDelete);
	
	if(start != -1){
		int end = start + exactSubstringToDelete.length();
		sb.delete(start, end);
	}
	
	System.out.println(sb.toString().trim());
	
	}
}