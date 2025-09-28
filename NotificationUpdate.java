class NotificationUpdate{

    public static void main(String args[]){
	
	String originalText = "Exam postponed";
	String textToFind = "postponed";
	String replacementText = "rescheduled";
	
	StringBuilder sb = new StringBuilder();
	
	String updatedText = originalText.replace(textToFind, replacementText);
	
    System.out.println(updatedText);
	
	}



}