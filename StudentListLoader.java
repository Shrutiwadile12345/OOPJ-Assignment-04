import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class StudentListLoader {
    public static void main(String[] args) {
        String fileName = "student_list.txt";  // Sample input

        try {
            File file = new File(fileName);
            Scanner sc = new Scanner(file);  // May throw FileNotFoundException
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
