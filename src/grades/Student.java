package grades;

import java.util.ArrayList;


public class Student {

    public ArrayList getGrades() {
        return this.grades;
    }

    // variables
    private String names;
    private ArrayList<Integer> grades;
    public double total = 0.0;

    // names constructor
    public Student(String names) {
        this.names = names;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getNames() {
        return names;
    }

    // names settor
    public void setNames(String names) {
        this.names = names;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradesAverage() {
        this.total = 0;
        for (Integer grade : grades) {
            this.total += ((double) (int) grade);
        }
        return (this.total/this.grades.size());
    }
    public static void main(String[] args) {

        Student newStudent = new Student("Bobby");
        newStudent.addGrade(55);
        newStudent.addGrade(77);
        newStudent.addGrade(36);
        newStudent.addGrade(78);
        System.out.println(newStudent.getGradesAverage());
    }
}
