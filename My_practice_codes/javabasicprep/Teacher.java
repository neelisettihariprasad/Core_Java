package javabasicprep;
import java.util.*;
public class Teacher {
	public void setMarksForStudents(Student[] students) {
        Scanner scanner = new Scanner(System.in);
        for (Student student : students) {
            System.out.println("Enter marks for " + student.getName() + " (Roll Number: " + student.getRollNumber() + "):");
            for (Subject subject : student.getSubjects()) {
                System.out.print("Enter marks for " + subject.getName() + ": ");
                double marks = scanner.nextDouble();
                subject.setMarks(marks);
            }
        }

	}

	public void calculateAverageMarks(Student[] students) {
	    double totalMarks = 0.0;
	    int count = 0;
	    for (Student student : students) {
	        for (Subject subject : student.getSubjects()) {
	            totalMarks += subject.getMarks();
	            count++;
	        }
	    }
	    double averageMarks = totalMarks / count;
	    System.out.println("Average Marks: " + averageMarks);
	}
	public void findMaxMinMarks(Student[] students) {
        double maxMarks = Double.MIN_VALUE;
        double minMarks = Double.MAX_VALUE;
        for (Student student : students) {
            for (Subject subject : student.getSubjects()) {
                double marks = subject.getMarks();
                if (marks > maxMarks) {
                    maxMarks = marks;
                }
                if (marks < minMarks) {
                    minMarks = marks;
                }
            }
        }
        System.out.println("Max Marks: " + maxMarks);
        System.out.println("Min Marks: " + minMarks);
    }
}

