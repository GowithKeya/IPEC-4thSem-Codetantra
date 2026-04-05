package q81890;

class Person {
    String name;
    int age;

    void setPersonDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int studentId;

    void setStudentDetails(int studentId) {
        this.studentId = studentId;
    }

    void displayStudentDetails() {
        displayPersonDetails();
        System.out.println("Student ID: " + studentId);
    }
}

class Exam extends Student {
    int marks1;
    int marks2;

    void setExamDetails(int marks1, int marks2) {
        this.marks1 = marks1;
        this.marks2 = marks2;
    }

    void displayExamDetail() {
        displayStudentDetail();
        System.out.println("Marks:" + " " + marks1 + "," + "" + marks2);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Exam e = new Exam();

        String name = sc.next();
        int age = sc.nextInt();
        int sudentID = sc.nextInt();
        int markes1 = sc.nextInt();
        int markes2 = sc.nextInt();

        e.setpersonDetail(name, age);
        e.setstudentDetail(studentID);
        e.setexamDetail(marks, markes);

        e.displayexamDetail();

    }
}