package controller;

import java.util.List;

import View.StudentView;
import model.Student;
import model.Teacher;
import model.User;
import service.GroupService;
import service.UserService;
import model.Group;

// Создать package – controller. Работу продолжаем в нем
// � Создать класс Controller агрегирующий в себе необходимые классы в виде
// полей, а инициализируем прям в поле.
// � Создаем метод созданиеСтудента – реализующий логику, путем вызова
// соответствующих методов интерфейсов:
// � Создания Студента в сервисе
// � Возвращение всех студентов в сервисе
// � Вызов view и передача списка найденных студентов

public class Controller {
    private UserService userService;
    private StudentView studentView;
    private GroupService groupService;

    public Student creatStudent(Student student){
        return (Student)userService.create(student);
    }
    public void printStudents(Student student){
        studentView.printStudent(student);
    }
    public List<User> returnStudents(){
        return userService.read();
    }
    public Group createGroup(Teacher teacher, List<Student> students){
        return groupService.CreatGroup(teacher, students);
    }
}
