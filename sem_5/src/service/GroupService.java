package service;

import java.util.List;


import model.Group;
import model.Student;
import model.Teacher;


public class GroupService {
    private Group group;

    public Group CreatGroup(Teacher teacher, List<Student> students){
        group = new Group(teacher, students);
        return group;
    }
}
