package JDBC;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class StudentDetialListJdbc extends ConnectionManager {
    public StudentDetialListJdbc() {
        super();
    }

    public int mainScreen() {
        System.out.println("1.ADD STUDENT");
        //System.out.println("2.INSERT DOB");
        System.out.println("2.DELETE STUDENT");
        System.out.println("3.LIST STUDENT");
        System.out.println("4.EXIT");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the Option:");
        int optionValue = scanner.nextInt();
        if (optionValue == 1 || optionValue == 2 || optionValue == 3 || optionValue == 4) {
            if (optionValue == 1) {
                return 1;
            } else if (optionValue == 2) {
                return 2;
            } else if (optionValue == 3) {
                return 3;
            } else if (optionValue == 4) {
                return 4;
            }
        } else {
            System.out.println("Please Enter valid option");
        }
        return 0;
    }

    public void addStudent() {
        do {
            Scanner scannerId = new Scanner(System.in);
            System.out.println("Enter Student ID:");
            Integer studentId = scannerId.nextInt();
            Scanner scannerName = new Scanner(System.in);
            System.out.println("Enter Student Name:");
            String studentName = scannerName.nextLine();
            try {
                if (studentId == null || studentName == "") {
                    System.out.println("Please Enter both Student Id and Student Name");
                } else {
                    PreparedStatement ps = con.prepareStatement("insert into StudentDetials (studentID,studentName) values(?,?)");
                    ps.setInt(1, studentId);
                    ps.setString(2, studentName);
                    ps.executeUpdate();
                    System.out.println("Student Created");
                    return;
                }

            } catch (Exception ex) {
                System.out.println("Error" + ex.getMessage());
            }
        } while (true);
    }
    public void deleteStudent() {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Student ID:");
            int studentId = scanner.nextInt();
            try{
                PreparedStatement ps = con.prepareStatement("delete from studentdetials where studentID=?");
                ps.setInt(1,studentId);
                ps.executeUpdate();
                System.out.println("Deleted Successfully");
                return;

            }catch(Exception ex){
                System.out.println("Invalid studentId");
            }

        } while (true);
    }
    public List<Student> listStudent(){
        ArrayList<Student> student=new ArrayList<Student>();
            try {
                PreparedStatement ps = con.prepareStatement("select * from studentdetials");
                ResultSet rs=ps.executeQuery();

                while(rs.next()){
                    Student stu=new Student();
                    stu.setStudentId(rs.getInt("studentID"));
                    stu.setStudentName(rs.getString("studentName"));
                    student.add(stu);
                }
            }catch(Exception ex){
                System.out.println("no students");
            }
        return student;
    }
    public void exitPage(){

    }
    public void setDob(){
        Scanner scanner=new Scanner(System.in);
        String date=scanner.next();
        try{
        SimpleDateFormat format=new SimpleDateFormat("dd/mm/yyyy");
        Date dob=format.parse(date);
        PreparedStatement ps=con.prepareStatement("Update studentdetials set DOB=? where studentID=?");
        //ps.
        }catch(Exception ex){
            System.out.println("Error:" +ex.getMessage());
        }
    }
}