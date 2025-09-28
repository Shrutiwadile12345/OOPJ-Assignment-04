class MarksValidationException extends Exception {
    public MarksValidationException(String message) {
        super(message);    // Custom exception for invalid marks
    }
}

public class MarksValidation {
    public static void main(String args[]) {
        int marks = -5;   // sample input

        try {
            validateMarks(marks);
            System.out.println("Valid marks!");
        } catch (MarksValidationException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void validateMarks(int marks) throws MarksValidationException {
        if (marks < 0 || marks > 100) {
            throw new MarksValidationException("Invalid marks");
        }
    }
}
