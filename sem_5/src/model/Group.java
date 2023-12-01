package model;

import java.util.List;

public class Group {
    Teacher teacher;
    List<Student> students;

    public Group(Teacher teacher, List<Student> students){
        this.students = students;
        this.teacher = teacher;
    }
}
