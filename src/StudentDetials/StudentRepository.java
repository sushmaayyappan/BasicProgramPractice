package StudentDetials;

public class StudentRepository {
    public static void main(String[] args) {
        int callValue;
        StudentDetialList sdl=new StudentDetialList();
        do {
            callValue = sdl.mainScreen();
            if (callValue == 1) {
                sdl.addStudent();
                // sdl.mainScreen();
            } else if (callValue == 2) {
                sdl.deleteStudent();
                // sdl.mainScreen();
            } else if (callValue == 3) {
                sdl.listStudent();
                //sdl.mainScreen();
            }
            if (callValue == 4) {
                sdl.exitPage();
                break;
            }
        }while(true);
    }
}
