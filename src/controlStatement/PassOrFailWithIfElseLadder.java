package controlStatement;

public class PassOrFailWithIfElseLadder {

    public static void checkStudentPassOrFail(int marks){
        if(marks >= 0 && marks<=100) {
            if (marks >= 35 && marks <= 50) {
                System.out.println("Student got grade D");
            } else if (marks >= 51 && marks <= 65) {
                System.out.println("Student got grade C");
            } else if (marks >= 66 && marks <= 75) {
                System.out.println("Student got grade B");
            } else if (marks >= 76 && marks <=85) {
                System.out.println("Student got grade A");
            } else {
                System.out.println("Student fail");
            }
        }
        else {
            System.out.println("Marks is not correct");
        }

    }

    public static void main(String[] args) {
        checkStudentPassOrFail(101);
        checkStudentPassOrFail(0);
        checkStudentPassOrFail(-12);
    }
}
