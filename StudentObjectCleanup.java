class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    // finalize method called before GC destroys the object
    @Override
    protected void finalize() throws Throwable {       //In Java 9+, finalize() is deprecated and marked for removal in newer versions.
        System.out.println("Student object for " + name + " is being garbage collected");
    }
}

public class StudentObjectCleanup {
    public static void main(String[] args) {
        Student s1 = new Student("Amit");

        // Make object eligible for garbage collection
        s1 = null;

        // Request garbage collection
        System.gc();

        System.out.println("End of main method");
    }
}
