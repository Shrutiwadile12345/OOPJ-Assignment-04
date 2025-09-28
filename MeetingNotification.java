class MeetingNotification{

    public static void main(String args[]){
	
	String baseText = "Meeting:";
	String textToAppend = "Friday at 5 PM";
	
	StringBuffer sb = new StringBuffer(baseText);
	sb.append(textToAppend);
	
	System.out.println(sb.toString());
	
	}

}