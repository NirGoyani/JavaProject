package constructorTopic;

public class StudentDetails {
    String studentName;
    int studentId;

    StudentDetails(String name, int id){
        studentName = name;
        studentId = id;
    }

    public void displayDetails(){
        System.out.println("Student Name is " + studentName);
        System.out.println("Student Id is " + studentId);
    }

    public static void main(String[] args) {
        StudentDetails studentDetails = new StudentDetails("Nirav",101);
        studentDetails.displayDetails();

        StudentDetails studentDetails1 = new StudentDetails("Yashbhai", 102);
        studentDetails1.displayDetails();
    }

}
