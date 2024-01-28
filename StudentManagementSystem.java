package task4a;

public class StudentManagementSystem {

	public static void main(String[] args) {
		try {
            // Example usage
            Student student1 = new Student(101, "Pavan#", 26, "Computer Science");
            student1.displayStudentInfo();

            // Uncomment the following lines to test exceptions
            /*
            Student student2 = new Student(102, "Alice123", 22, "Mathematics");
            Student student3 = new Student(103, "Bob$", 18, "Physics");
            */
        } catch (AgeNotWithinRangeException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (NameNotValidException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

	}


