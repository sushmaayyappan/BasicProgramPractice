package JDBC;

import java.util.List;

public class StudentDetialRepository {

    public static void main(String[] args) {
        int optionValue;
        do {
            StudentDetialListJdbc sdlj = new StudentDetialListJdbc();
            optionValue = sdlj.mainScreen();
            if (optionValue == 1) {
                sdlj.addStudent();
            } else if (optionValue == 2) {
                sdlj.deleteStudent();
            } else if (optionValue == 3) {
                List<Student> stud=sdlj.listStudent();
                for (Student stude:stud) {
                    System.out.println("studentId:"+stude.studentId+" "+"studentName:"+stude.studentName);
                }
            }
            if (optionValue == 4) {
                break;
            }
        }while(true);
    }
}
