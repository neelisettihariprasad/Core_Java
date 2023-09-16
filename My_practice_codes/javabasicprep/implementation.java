package javabasicprep;

public class implementation {
	public static void main(String[] args) {
        Student[] students = new Student[10];

        // Instantiate 10 students with name and roll number
        for (int i = 0; i < 10; i++) {
            students[i] = new Student("Student " + (i + 1), i + 101);
        }

        Teacher teacher = new Teacher();

        // Set marks for students
        teacher.setMarksForStudents(students);

        // Calculate average marks
        teacher.calculateAverageMarks(students);

        // Find and display max and min marks
        teacher.findMaxMinMarks(students);
    }
}




