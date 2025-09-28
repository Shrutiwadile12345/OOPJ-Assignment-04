class ExamScoresException {
    public static void main(String args[]) {

        int scores[] = {78, 90, 85};  // 3 scores

        try {
                 int value = scores[5];  // Trying to access index 5, which doesn't exist
                 System.out.println("Score: " + value);
				 
        } catch (ArrayIndexOutOfBoundsException e) {
			
            System.out.println("Invalid index accessed!");
        }
    }
}
