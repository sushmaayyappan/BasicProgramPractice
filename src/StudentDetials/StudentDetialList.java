package StudentDetials;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDetialList {
    private String mainPage="mainScreen()";
    private String selectedOption;
    List<Student> studentDetials = new ArrayList<>();
    public int mainScreen(){
        System.out.println("1.ADD STUDENT");
        System.out.println("2.DELETE STUDENT");
        System.out.println("3.LIST STUDENT");
        System.out.println("4.EXIT");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter the Option:");
        int optionValue=scanner.nextInt();
        if(optionValue==1||optionValue==2||optionValue==3||optionValue==4) {
            if (optionValue == 1) {
                return 1;
            } else if (optionValue == 2) {
                return 2;
            } else if (optionValue == 3) {
                return 3;
            } else if (optionValue == 4) {
                return 4;
            }
        }else {
                System.out.println("Please Enter valid option");
         }
        return 0;
    }
    public void addStudent() {
        do{
            Scanner scannerId = new Scanner(System.in);
            System.out.println("Enter Student ID:");
            Integer studentId = scannerId.nextInt();
            Scanner scannerName = new Scanner(System.in);
            System.out.println("Enter Student Name:");
            String studentName = scannerName.nextLine();
            if (studentId == null || studentName == "") {
                System.out.println("Please Enter both Student Id and Student Name");
            } else {
                Student stu = new Student();
                stu.setStudentId(studentId);
                stu.setStudentName(studentName);
                studentDetials.add(stu);
                break;
            }
        }while(true);
    }
    public void deleteStudent(){
        do {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Student ID:");
            int studentId = scanner.nextInt();
            int deletedflag=0;
                for (Student stud : studentDetials) {
                    if (studentId == stud.getStudentId()) {
                        //studentDetials.remove(studentId);
                        studentDetials.remove(stud);
                        System.out.println("Deleted sucessfully");
                        deletedflag = 1;
                        return;
                    }
                }
                if(deletedflag==0) {
                    System.out.println("Invalid Student ID");
                }
        }while(true);
    }
    public void listStudent(){
        for (Student student:studentDetials) {
            
            System.out.println(student.getStudentId() + ":" + student.getStudentName());
        }
    }
    public void exitPage(){

    }
}
