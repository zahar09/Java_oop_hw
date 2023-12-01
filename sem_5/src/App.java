import controller.Controller;
import model.Student;

public class App {
    public class Main {
        public static void main(String[] args) {
            Controller controller = new Controller();
            Student student =  controller.creatStudent(new Student("gghg", "hg", 13, 0));
            controller.returnStudents();
            controller.printStudents(student);
        }
    }
}
