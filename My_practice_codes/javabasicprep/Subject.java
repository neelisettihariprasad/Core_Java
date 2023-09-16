package javabasicprep;

public class Subject {
	private String name;
    private double marks;

    public Subject(String name) {
        this.name = name;
        this.marks = 0.0;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

}
