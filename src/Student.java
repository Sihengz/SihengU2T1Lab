public class Student {

    private String grade;
    private String name;
    private double avg;

    public Student(String gradeLevel, String firstName, int average) {
        name = firstName;
        grade = gradeLevel;
        avg = average;

    }

    public void introduce() {
        System.out.println("Hello, my name is " + name + ", I am a " + grade + " with a " + avg + " average");

    }
}
