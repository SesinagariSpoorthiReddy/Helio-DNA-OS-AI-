public class StudentTest1 {
    private String name;
    private int rollNumber;
    private int age;
    private double marks;
    private String grade;

    public StudentTest1(String name, int rollNumber, int age, double marks, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
        this.marks = marks;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getAge() {
        return age;
    }

    public double getMarks() {
        return marks;
    } 

    public String getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void displayDetails() {
        System.out.println("Student Details");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }

    public String checkResult() {
        if (marks >= 35) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static void main(String[] args) {
        StudentTest1 student = new StudentTest1("ramya", 511, 21, 56.5, "C");
        student.displayDetails();
        System.out.println("Result: " + student.checkResult());
        System.out.println("Student Name: " + student.getName());
        student.setMarks(90);
        System.out.println("Updated Marks: " + student.getMarks());
        System.out.println("Updated Result: " + student.checkResult());
    }
}