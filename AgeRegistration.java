// Custom Exception Class
class AgeNotValidException extends Exception {
    AgeNotValidException(String message) {
        super(message);
    }
}

// Registration Class
class AgeRegistration {
    static void register(int age) throws AgeNotValidException {
        if (age < 18) {
            throw new AgeNotValidException("Age must be ≥ 18");
        } else {
            System.out.println("Registration successful!");
        }
    }

    public static void main(String[] args) {
        int participantAge = 16; // Sample input

        try {
            register(participantAge);
        } catch (AgeNotValidException e) {
            System.out.println(e);
        }
    }
}
