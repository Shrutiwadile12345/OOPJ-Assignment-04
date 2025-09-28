class RoomAllocationUpdate{

    public static void main(String args[]){
	
	String originalText = " 101";
	String textToInsert = "New Building";
	int insertIndex = 0;
	
	StringBuffer sb = new StringBuffer(originalText);
	sb.insert(0, " " + textToInsert);
	
	System.out.println(sb.toString());
	
	}
}