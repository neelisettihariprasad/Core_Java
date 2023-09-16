package javabasicprep;

public class Student {
	private String name;
    private int rollNumber;
    private Subject[] subjects;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.subjects = new Subject[2];
        subjects[0] = new Subject("Maths");
        subjects[1] = new Subject("English");
    }

    public String getName() {
        return name;
    }
    public int getRollNumber() {
        return rollNumber;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

}
